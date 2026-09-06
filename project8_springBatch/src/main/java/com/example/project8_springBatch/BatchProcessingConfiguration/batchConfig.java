package com.example.project8_springBatch.BatchProcessingConfiguration;

import com.example.project8_springBatch.Entity.person;
import com.example.project8_springBatch.ItemProcessor.PersonItemProcessor;
import com.example.project8_springBatch.Listener.JobCompletionNotificationListener;
import jakarta.persistence.EntityManagerFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.job.Job;
import org.springframework.batch.core.job.builder.JobBuilder;
import org.springframework.batch.core.job.parameters.RunIdIncrementer;
//import org.springframework.batch.core.launch.JobLauncher;
//import org.springframework.batch.core.launch.support.SimpleJobOperator;
import org.springframework.batch.core.repository.JobRepository;
//import org.springframework.batch.core.repository.explore.JobExplorer;
import org.springframework.batch.core.step.Step;
//import org.springframework.batch.core.step.builder.SimpleStepBuilder;
import org.springframework.batch.core.step.builder.StepBuilder;
//import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.infrastructure.item.database.JpaItemWriter;
import org.springframework.batch.infrastructure.item.file.FlatFileItemReader;
import org.springframework.batch.infrastructure.item.file.builder.FlatFileItemReaderBuilder;
import org.springframework.batch.infrastructure.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;

@Configuration
@EnableBatchProcessing //to make this class a batch processor config one
@RequiredArgsConstructor
public class batchConfig {

    private final JobRepository jobRepository;
    private final DataSource dataSource;
    private final PersonItemProcessor personItemProcessor;
    private final EntityManagerFactory entityManagerFactory;
    private final PlatformTransactionManager transactionManager;

    //READER
    @Bean
    public FlatFileItemReader<person> reader() {
        return new FlatFileItemReaderBuilder<person>().name("reader").
                resource(new ClassPathResource("input/people.csv")). // ClassPathResource looks for the file inside src/main/resources/
                        delimited(). // Tells Spring Batch that the file is delimited (usually by comma)
                        names("firstName", "lastName", "email").
                fieldSetMapper(new BeanWrapperFieldSetMapper<person>() { // Converts each line (FieldSet) into a Person object
                    {
                        setTargetType(person.class);
                    }
                }).linesToSkip(1).build();
    }

    //WRITER
    @Bean
    public JpaItemWriter<person> personWriter() {
//        JpaItemWriter is a built-in ItemWriter in Spring Batch that writes (persists)
//        Java objects (entities) into a database using JPA (Jakarta Persistence API).
        JpaItemWriter<person> writer = new JpaItemWriter<>(entityManagerFactory);
        return writer;
    }

    //STEP
    @Bean
    public Step importPersonStep(JobRepository jobRepository,
                                 FlatFileItemReader<person> reader,
                                 PersonItemProcessor personItemProcessor,
                                 JpaItemWriter<person> personWriter) {

        return new StepBuilder("importPersonStep", jobRepository)
                .<person, person>chunk(100) // 100 = commit interval; reads/processes 100 items, then writes+commits as one transaction
                .transactionManager(transactionManager) // required in 6.0+, chunk(int) alone runs without a transaction
                .reader(reader)
                .processor(personItemProcessor)
                .writer(personWriter)
                .build();
    }

    //JOB
    //giving step and listeners as args
    @Bean
    public Job importPersonJob(Step importPersonStep, JobCompletionNotificationListener listener) {
        return new JobBuilder("importPersonJob", jobRepository). //jobRepo is required to store metadata about job like completion, logs, execution status etc
                incrementer(new RunIdIncrementer()). //automatically adds a new unique run.id parameter to each job run
                listener(listener).
                start(importPersonStep).
                build();
    }
}

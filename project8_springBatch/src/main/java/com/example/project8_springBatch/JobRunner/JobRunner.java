package com.example.project8_springBatch.JobRunner;

import lombok.RequiredArgsConstructor;
import org.jspecify.annotations.NonNull;
import org.springframework.batch.core.job.Job;
import org.springframework.batch.core.job.parameters.JobParameters;
import org.springframework.batch.core.job.parameters.JobParametersBuilder;
import org.springframework.batch.core.launch.JobOperator;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

//JobRunner automatically starts your Spring Batch job when the application launches.
//It implements CommandLineRunner so the run() method executes right after Spring Boot startup.
//Purpose: No need to manually trigger the job — it runs automatically on app start.
@Component
@RequiredArgsConstructor
public class JobRunner implements CommandLineRunner {

    private final JobOperator jobOperator;
    private final Job job;

    @Override
    public void run(String @NonNull ... args) throws Exception {
        // preferred (6.0+) signature: start(Job, JobParameters), not start(String, Properties)
        JobParameters params = new JobParametersBuilder()
                .addLong("systemTime", System.currentTimeMillis())
                .toJobParameters();

        //starts the job
        jobOperator.start(job, params);
    }
}
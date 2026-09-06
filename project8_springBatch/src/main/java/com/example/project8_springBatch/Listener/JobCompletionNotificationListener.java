package com.example.project8_springBatch.Listener;

import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.job.JobExecution;
import org.springframework.batch.core.listener.JobExecutionListener;
//import org.springframework.batch.core.repository.persistence.StepExecution;
import org.springframework.batch.core.step.StepExecution;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class JobCompletionNotificationListener implements JobExecutionListener {

    private static final Logger log = LoggerFactory.getLogger(JobCompletionNotificationListener.class);

    @Override
    public void afterJob(JobExecution jobExecution) {
        if (jobExecution.getStatus() == BatchStatus.COMPLETED) {
            log.info("✅ JOB COMPLETED SUCCESSFULLY! Processed {} items",
                    jobExecution.getStepExecutions().stream()
                            .mapToLong(StepExecution::getWriteCount)
                            .sum());
        } else if (jobExecution.getStatus() == BatchStatus.FAILED) {
            log.error("❌ JOB FAILED");
        }
    }
}

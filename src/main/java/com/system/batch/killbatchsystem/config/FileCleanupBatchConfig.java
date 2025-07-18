//package com.system.batch.killbatchsystem.config;
//
//import com.system.batch.killbatchsystem.tasklet.DeleteOldFileTasklet;
//import lombok.RequiredArgsConstructor;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.batch.core.Job;
//import org.springframework.batch.core.Step;
//import org.springframework.batch.core.job.builder.JobBuilder;
//import org.springframework.batch.core.repository.JobRepository;
//import org.springframework.batch.core.step.builder.StepBuilder;
//import org.springframework.batch.core.step.tasklet.Tasklet;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.transaction.PlatformTransactionManager;
//
//@Configuration
//@Slf4j
//@RequiredArgsConstructor
//public class FileCleanupBatchConfig {
//
//  private final JobRepository jobRepository;
//  private final PlatformTransactionManager transactionManager;
//
//  @Bean
//  public Tasklet deleteOldFilesTasklet() {
//    return new DeleteOldFileTasklet("/path/to/temp", 30);
//  }
//
//  @Bean
//  public Step deleteOldFilesStep() {
//    return new StepBuilder("deleteOldFilesStep", jobRepository)
//        .tasklet(deleteOldFilesTasklet(), transactionManager)
//        .build();
//  }
//
//  @Bean
//  public Job deleteOldFilesJob() {
//    return new JobBuilder("deleteOldFilesJob", jobRepository)
//        .start(deleteOldFilesStep())
//        .build();
//  }
//}

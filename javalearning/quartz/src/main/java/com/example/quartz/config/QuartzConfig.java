package com.example.quartz.config;

import com.example.quartz.jobs.TestQuartz;
import org.quartz.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class QuartzConfig {

    @Bean
    public JobDetail treatJobDetatil(){
        return JobBuilder.newJob(TestQuartz.class)
                .withIdentity("TestQuartz")
                .storeDurably()
                .build();
    }
    @Bean
    public Trigger testQuartzTrigger(){
        SimpleScheduleBuilder scheduleBuilder=SimpleScheduleBuilder.simpleSchedule()
                .withIntervalInSeconds(1)
                .repeatForever();
        return TriggerBuilder.newTrigger().forJob(treatJobDetatil())
                .withIdentity("TestQuartz")
                .withSchedule(scheduleBuilder)
                .build();
    }
}

package com.huang.practice.elasticjob;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by huang_jiangling on 2018/2/5.
 */
@SpringBootApplication
@ImportResource(value = {"classpath:elastic-job.xml"})
public class SpringBootForJob {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootForJob.class, args);
    }
}

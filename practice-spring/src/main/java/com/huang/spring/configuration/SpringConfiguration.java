package com.huang.spring.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Date;

@Configuration
public class SpringConfiguration {

    @Bean
    public Date getDate(){
        return new Date();
    }
}

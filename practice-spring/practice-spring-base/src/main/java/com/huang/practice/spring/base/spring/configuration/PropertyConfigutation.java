package com.huang.practice.spring.base.spring.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;

@Configuration
public class PropertyConfigutation {

    @Bean
    public PropertySourcesPlaceholderConfigurer placeholderConfigurer() {
        PropertySourcesPlaceholderConfigurer placeholderConfigurer = new PropertySourcesPlaceholderConfigurer();
        placeholderConfigurer.setLocation(new ClassPathResource("app.properties"));
        return placeholderConfigurer;
    }

    @Bean
    public String palceholderTest(@Value("${name}") String name) {
        System.out.println("==================");
        System.out.println(name);
        System.out.println("==================");
        return name;
    }
}

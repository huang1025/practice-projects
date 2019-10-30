package com.jiang.practice.spring.boot.async;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by huang_jiangling on 2018/2/6.
 */
@Configuration
public class AsyncTest2 {

    @Autowired
    private AsyncTest asyncTest;

    @Bean
    public String hehe() {
        for (int i = 0; i < 30; i++) {
            asyncTest.print();
        }
        return "hehe";
    }
}

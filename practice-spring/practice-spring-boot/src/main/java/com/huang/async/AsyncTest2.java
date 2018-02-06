package com.huang.async;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by huang_jiangling on 2018/2/6.
 */
@Configuration
public class AsyncTest2 {

    @Bean
    public String hehe(AsyncTest asyncTest) {
        for (int i = 0; i < 30; i++) {
            asyncTest.print();
        }
        return "hehe";
    }
}

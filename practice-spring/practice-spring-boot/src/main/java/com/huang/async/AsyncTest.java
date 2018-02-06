package com.huang.async;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * Created by huang_jiangling on 2018/2/6.
 */
@Configuration
@EnableAsync
public class AsyncTest {

    @Async
    public void print() {
        System.out.println(Thread.currentThread().getName());
    }

}

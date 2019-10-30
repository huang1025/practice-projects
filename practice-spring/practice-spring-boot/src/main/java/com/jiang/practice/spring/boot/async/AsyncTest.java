package com.jiang.practice.spring.boot.async;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * Created by huang_jiangling on 2018/2/6.
 */
@Component
public class AsyncTest {

    @Async
    public void print() {
        System.out.println(Thread.currentThread().getName());
    }

}

package com.huang.practice.spring.base.practice.thread._4_;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by huang_jiangling on 2017/8/17.
 */
public class VolatileTest2 implements Runnable {

    private static volatile int num = 0;

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            num += 1;
        }
        System.out.println(num);
    }

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 10; i++) {
            executorService.submit(new VolatileTest2());
        }

        Thread.sleep(300);
        executorService.shutdown();
    }
}

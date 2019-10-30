package com.huang.practice.spring.base.practice.thread._3_;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by huang on 2017/6/23.
 */
public class CountDownLatchTest {

    public static void main(String[] args) {
        CountDownLatch countDownLatch = new CountDownLatch(3);
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                String name = Thread.currentThread().getName();
                System.out.println("线程:" + name + "准备执行；");
                countDownLatch.countDown();
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("线程:" + name + "开始执行；");
            }
        };

        ExecutorService executorService = Executors.newFixedThreadPool(30);
        for (int i = 0; i < 3; i++) {
            executorService.submit(runnable);
        }
    }
}

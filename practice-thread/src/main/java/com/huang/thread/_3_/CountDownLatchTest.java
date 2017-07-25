package com.huang.thread._3_;

import java.util.concurrent.CountDownLatch;

/**
 * Created by huang on 2017/6/23.
 */
public class CountDownLatchTest {
    CountDownLatch countDownLatch = new CountDownLatch(12);

    public static void main(String[] args) {
        CountDownLatchTest demo = new CountDownLatchTest();
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("准备 countDown；");
                    demo.countDownLatch.countDown();
                    demo.countDownLatch.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}

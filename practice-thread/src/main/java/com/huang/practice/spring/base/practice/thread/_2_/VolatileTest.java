package com.huang.practice.spring.base.practice.thread._2_;

/**
 * Created by huang_jiangling on 2017/7/22.
 */
public class VolatileTest {

    int i = 0;

    Runnable r = new Runnable() {
        @Override
        public void run() {
            for (int j = 0; j < 1000; j++) {
                i++;
            }
        }
    };

    public static void main(String[] args) throws InterruptedException {
        VolatileTest volatileTest = new VolatileTest();
        Thread[] threads = new Thread[10];
        for (int j = 0; j < 10; j++) {
            threads[j] = new Thread(volatileTest.r);
        }
        for (int j = 0; j < 10; j++) {
            threads[j].start();
        }
        Thread.sleep(4000);
        System.out.println(volatileTest.i);
    }
}

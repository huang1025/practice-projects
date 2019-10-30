package com.huang.practice.spring.base.practice.thread._2_;

import java.util.Date;

/**
 * Created by huang_jiangling on 2017/7/22.
 */
public class ThreadGroupTest {
    ThreadGroup threadGroup = new ThreadGroup("myThreadGroup");

    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            int j = 0;
            for (int i = 0; i < 1000; i++) {
                try {
                    Thread.sleep(2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                j++;
            }
            System.out.println(j);
            System.out.println("其他线程：" + new Date().getTime());
        }
    };

    public static void main(String[] args) {
        ThreadGroupTest threadGroupTest = new ThreadGroupTest();
        Thread thread1 = new Thread(threadGroupTest.runnable);
        Thread thread2 = new Thread(threadGroupTest.runnable);
        thread1.start();
        thread2.start();
        for (int i = 0; i < 1000; i++) {
            System.out.println(threadGroupTest.threadGroup.activeCount());
        }
    }
}

package com.huang.thread._4_;

import java.util.Random;

/**
 * Created by huang_jiangling on 2017/7/24.
 */
public class ThreadSafeTest {
    public static void main(String[] args) {
        final Integer integer = 0;
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    int temp = integer;
                    try {
                        Thread.sleep(new Random().nextInt(20));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
//                    integer = temp + 1;
                }
                System.out.println(integer);
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    int temp = integer;
                    try {
                        Thread.sleep(new Random().nextInt(10));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
//                    integer = temp + 1;
                }
                System.out.println(integer);
            }
        }).start();
        System.out.println("主线程结束运行");
    }
}

package com.huang.thread._4_;

import java.util.Random;

/**
 * Created by huang_jiangling on 2017/8/19.
 */
public class ThreadLocalInitTest {

    static ThreadLocal<Integer> local = new ThreadLocal() {
        @Override
        protected Integer initialValue() {
            return new Random().nextInt(1000);
        }
    };

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(local.get());
                }
            }).start();
        }
    }
}

package com.huang.practice.spring.base.practice.thread._2_;

public class WaitTest1 {

    public static void main(String[] args) throws InterruptedException {
        Object obj = new Object();
        synchronized (obj) {
            obj.notify();
        }
    }
}

package com.huang.practice.spring.base.practice.thread._2_;

/**
 * Created by huang_jiangling on 2017/8/13.
 */
public class ThreadNameTest extends Thread {

    public ThreadNameTest() {
        System.out.println(Thread.currentThread().getName());//mian
        System.out.println(this.getName());//Thread-0
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());//A
        System.out.println(this.getName());//Thread-0
    }

    public static void main(String[] args) {
        ThreadNameTest test = new ThreadNameTest();
        Thread thread = new Thread(test, "A");
        thread.start();
    }
}

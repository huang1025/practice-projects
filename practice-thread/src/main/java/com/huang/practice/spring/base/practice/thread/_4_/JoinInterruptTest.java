package com.huang.practice.spring.base.practice.thread._4_;

/**
 * Created by huang_jiangling on 2017/8/19.
 */
public class JoinInterruptTest {

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(1000);
                        System.out.println("print something...");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        thread.start();

        Thread joinThread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("thread2 let thread join;");
                    thread.join();
                } catch (InterruptedException e) {
                    System.out.println("thread2 throw exception;");
                    e.printStackTrace();
                }
                System.out.println("thread2 end;");
            }
        });
        joinThread.start();

        thread.sleep(5000);
        joinThread.interrupt();
    }
}

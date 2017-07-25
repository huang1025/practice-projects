package com.huang.thread._2_;

public class ThreadStop implements Runnable {
    boolean flag = false;
    int num1 = 1;
    int num2 = 1;

    @Override
    public void run() {
        while (num1 < 100) {
            if (flag) {
                return;
            }
            synchronized (this) {
                ++num1;
                try {
                    Thread.currentThread().sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                ++num2;
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadStop threadStop = new ThreadStop();
        Thread thread = new Thread(threadStop);
        thread.start();
        Thread.currentThread().sleep(2000);
//        thread.stop();
        threadStop.flag = true;
    }
}

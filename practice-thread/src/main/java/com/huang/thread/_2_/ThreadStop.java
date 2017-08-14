package com.huang.thread._2_;

public class ThreadStop implements Runnable {
    boolean flag = false;
    int num = 1;

    @Override
    public void run() {
        while (true) {
            if (flag) {
                return;
            }
            synchronized (this) {
                try {
                    Thread.currentThread().sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + ":" + (++num));
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadStop threadStop = new ThreadStop();
        Thread thread = new Thread(threadStop);
        thread.start();
        Thread.currentThread().sleep(2000);
//        thread.stop();
        System.out.println("main prepare to stop thread...");
        threadStop.flag = true;
    }
}

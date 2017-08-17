package com.huang.thread._4_;

/**
 * Created by huang_jiangling on 2017/8/17.
 */
public class VolatileTest implements Runnable {

    private boolean flag = true;

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    @Override
    public void run() {
        while (flag) {
            System.out.println("thread is running...");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        VolatileTest test = new VolatileTest();
        new Thread(test).start();

        Thread.sleep(1000);
        test.setFlag(false);
    }
}

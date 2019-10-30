package com.huang.practice.spring.base.practice.thread._5_;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by huang_jiangling on 2017/8/20.
 */
public class TimerCancleTest {
    public static void main(String[] args) {
        int i = 1;
        while (true) {
            Timer timer = new Timer();
            timer.schedule(new MyTimerTask(i++), new Date());
            timer.cancel();
        }
    }

    static class MyTimerTask extends TimerTask {
        private int i;

        public MyTimerTask(int i) {
            this.i = i;
        }

        @Override
        public void run() {
            System.out.println("execute:" + i);
        }
    }
}
//execute:512
//execute:796
//execute:908
//execute:909
//execute:910
//execute:911
//execute:922
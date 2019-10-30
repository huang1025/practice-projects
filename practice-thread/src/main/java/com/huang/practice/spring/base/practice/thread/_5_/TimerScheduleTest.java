package com.huang.practice.spring.base.practice.thread._5_;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by huang_jiangling on 2017/8/20.
 */
public class TimerScheduleTest {

    private static Timer timer = new Timer(true);
    private static SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    private static Calendar calendar = Calendar.getInstance();

    public static void main(String[] args) throws ParseException, InterruptedException {
        calendar.setTime(new Date());
        calendar.add(Calendar.SECOND, 2);
        Date time1 = calendar.getTime();
        calendar.add(Calendar.SECOND, 2);
        Date time2 = calendar.getTime();

        timer.schedule(new ScheduleContent(time2), time2);
        timer.schedule(new ScheduleContent(time1), time1);

        Thread.sleep(20000);
    }

    static class ScheduleContent extends TimerTask {
        Date date;

        public ScheduleContent(Date date) {
            this.date = date;
        }

        @Override
        public void run() {
            System.out.println("thread-name:" + Thread.currentThread().getName());
            System.out.println("schedule-time:" + dateFormat.format(date));
            System.out.println("execute-time:" + dateFormat.format(new Date()));
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
//thread-name:Timer-0
//schedule-time:2017-08-20 22:55:26
//execute-time:2017-08-20 22:55:26
//thread-name:Timer-0
//schedule-time:2017-08-20 22:55:28
//execute-time:2017-08-20 22:55:31
}

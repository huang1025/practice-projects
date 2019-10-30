package com.huang.practice.base.util;

import com.huang.practice.base.model.enums.DateEnum;
import com.huang.practice.base.model.enums.DatePattrnEnum;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {

    public static Date changeDate(Date date, DateEnum dateEnum, int num) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(dateEnum.getTime(), num);
        return calendar.getTime();
    }

    public static String date2String(Date date, DatePattrnEnum datePattrnEnum) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(datePattrnEnum.getPattern());
        return simpleDateFormat.format(date);
    }

    public static void main(String[] args) {
        int i = 7;
        int j=6;
        System.out.println(i^j);
    }
}

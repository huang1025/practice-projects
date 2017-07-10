package com.huang.spring.scan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class AutowireTest {

    private Date date;

    public Date getDate() {
        return date;
    }

    @Autowired
    public void haha(Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        System.out.println(simpleDateFormat.format(date));
    }

    @Autowired
    public void hehe(){
        System.out.println("我就是想在容器启动的时候，打印点东西；");
    }
}

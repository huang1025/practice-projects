package com.huang.spring.scan;

import com.huang.base.model.enums.DatePattrnEnum;
import com.huang.base.util.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
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
    public void haha(@Qualifier("getDate") Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        System.out.println(simpleDateFormat.format(date));
    }

    @Autowired
    public void hehe(){
        System.out.println("我就是想在容器启动的时候，打印点东西；");
    }

    @Autowired
    public void sameBeanNameTest(@Qualifier("getDate")Date date){
        System.out.println("========================");
        System.out.println(DateUtil.date2String(date, DatePattrnEnum.yyyyMMddHHmmss));
        System.out.println("========================");
    }

    @Autowired
    public void hehe(@Value("${name}") String name) {
        System.out.println(name + "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}

package com.huang.spring.configuration;

import com.huang.base.model.enums.DateEnum;
import com.huang.base.model.enums.DatePattrnEnum;
import com.huang.base.util.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.Date;
import java.util.Random;

@Configuration
public class SpringConfiguration {

    @Bean
    public Date getDate() {
        System.out.println("getBean invoking...");
        return new Date();
    }

    @Bean(name = "getDate")
    public Date getDate2() {
        System.out.println("getBean2 invoking...");
        return DateUtil.changeDate(getDate(), DateEnum.MONTH, 1);
    }

    @Bean(name = "getDate")
    public Date getDate3() {
        System.out.println("getBean3 invoking...");
        return DateUtil.changeDate(getDate(), DateEnum.MONTH, 2);
    }

    @Bean(name = "getDate4")
    public Date getDate4() {
        System.out.println("getBean4 invoking...");
        return DateUtil.changeDate(getDate(), DateEnum.MONTH, 4);
    }

    @Bean(name = "getDate5")
    public Date getDate5() {
        System.out.println("getBean5 invoking...");
        return DateUtil.changeDate(getDate3(), DateEnum.MONTH, 5);
    }

//    @Bean
//    public SimpleDateFormat getSimpleDateFormat(SimpleDateFormat format) {
//        System.out.println("creating format...");
//        return format;
//    }

    @Bean(name = "getDate6")
    public Date getDate6(@Qualifier("getDate5") Date date) {
        System.out.println("getBean6 invoking...");
        return DateUtil.changeDate(getDate3(), DateEnum.MONTH, 6);
    }

    ////////////////////////////////////////////////////////////////////////

    @Bean
    @Qualifier("name")
    public String getName() {
        return "huang";
    }

    @Autowired
    @Qualifier("name")//最好写到方法的参数中去，不要写在这里；
    private void getNmae(String name) {
        System.out.println(name);
    }

    ////////////////////////////////////////////////////////////////////////

    @Autowired
    @Qualifier("getDate5")
    public void qualifierTest(Date date) {
        System.out.println("//////////////");
        System.out.println(DateUtil.date2String(date, DatePattrnEnum.yyyyMMddHHmmss));
        System.out.println("//////////////");
    }

    @Autowired
    public void qualifierTest2(@Qualifier("getDate5") Date date, String name) {
        System.out.println("//////////////");
        System.out.println(DateUtil.date2String(date, DatePattrnEnum.yyyyMMddHHmmss));
        System.out.println(name);
        System.out.println("//////////////");
    }

    ////////////////////////////////////////////////////////////////////////

    @Bean(name = "age")
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Integer getInteger() {
        return new Random().nextInt(20);
    }

    @Bean(name = "myAge")
    public Integer getMyAge(@Qualifier("age") Integer age) {
        System.out.println("getMyAge:" + (age - 1));//15
        return age - 1;
    }

    @Autowired
    public void getInteger1(@Qualifier("age") Integer integer) {
        System.out.println("age:" + integer);//19
    }

    @Autowired
    public void getInteger2(@Qualifier("age") Integer integer) {
        System.out.println("age:" + integer);//11
    }

    @Autowired
    public void getInteger3(@Qualifier("myAge") Integer integer) {
        System.out.println("myAge:" + integer);//15
    }

    @Autowired
    public void getInteger4(@Qualifier("myAge") Integer integer) {
        System.out.println("myAge:" + integer);//15
    }

    ////////////////////////////////////////////////////////////////////////
}

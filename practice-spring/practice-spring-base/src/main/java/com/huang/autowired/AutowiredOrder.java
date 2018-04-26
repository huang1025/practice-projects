package com.huang.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;
import java.util.Date;

/**
 * Created by huang_jiangling on 2018/4/26.
 */
@Configuration
public class AutowiredOrder {
    @Autowired
    private Date date;
    @Resource
    private User user;

    @Bean
    public Date date() {
        return new Date();
    }

    @Bean
    public User user() {
        System.out.println(date);//null
        return new User(date);
    }
}

class User {
    private Date date;

    public User(Date date) {
        this.date = date;
    }
}

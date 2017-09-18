package com.huang.spring.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by huang_jiangling on 2017/8/31.
 */
@Configuration
public class ConfigurationTest {

    @Bean
    public Container container() {
        return new Container();
    }
}

class Container {
    @Autowired
    private HuangBean bean;

    public HuangBean getBean() {
        return bean;
    }

    public void setBean(HuangBean bean) {
        this.bean = bean;
    }
}
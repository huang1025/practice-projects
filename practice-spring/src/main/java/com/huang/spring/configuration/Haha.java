package com.huang.spring.configuration;

import com.alibaba.fastjson.JSON;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * Created by huang_jiangling on 2017/8/31.
 */
@Component
public class Haha implements ApplicationContextAware {
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        Container bean = applicationContext.getBean(Container.class);
        System.out.println("++++++++++++++");
        System.out.println(JSON.toJSONString(bean.getBean()));
        System.out.println("++++++++++++++");
    }
}

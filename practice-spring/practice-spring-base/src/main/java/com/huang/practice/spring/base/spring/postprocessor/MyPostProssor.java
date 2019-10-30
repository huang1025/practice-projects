package com.huang.practice.spring.base.spring.postprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.core.Ordered;
import org.springframework.core.PriorityOrdered;
import org.springframework.stereotype.Component;

/**
 * Created by huang_jiangling on 2017/9/18.
 */
@Component
public class MyPostProssor implements BeanFactoryPostProcessor, PriorityOrdered {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        String[] beanDefinitionNames = beanFactory.getBeanDefinitionNames();
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^");
        for (String each : beanDefinitionNames) {
            System.out.println(each + "=========" + beanFactory.getBeanDefinition(each).getBeanClassName());
        }
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^");
    }

    @Override
    public int getOrder() {
        return Ordered.LOWEST_PRECEDENCE;
    }
}

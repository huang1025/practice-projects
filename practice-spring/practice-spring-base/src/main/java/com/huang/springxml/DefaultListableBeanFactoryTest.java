package com.huang.springxml;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

/**
 * Created by huang_jiangling on 2018/4/25.
 */
public class DefaultListableBeanFactoryTest {
    public static void main(String[] args) {
        ClassPathResource classPathResource = new ClassPathResource("spring.xml");
        DefaultListableBeanFactory defaultListableBeanFactory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(defaultListableBeanFactory);
        xmlBeanDefinitionReader.loadBeanDefinitions(classPathResource);
    }
}

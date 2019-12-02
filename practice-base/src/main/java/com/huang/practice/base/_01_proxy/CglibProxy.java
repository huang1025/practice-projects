package com.huang.practice.base._01_proxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * CglibProxy -
 *
 * @author: huang_jiangling
 * @date: 2019/12/2
 **/
public class CglibProxy {

    public CglibProxy() {
    }

    public static void main(String[] args) {
        interfaceProxy();
    }

    private static void interfaceProxy() {
        Enhancer enhancer = new Enhancer();
        enhancer.setInterfaces(new Class[]{Sayer.class});
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                System.out.println("sayer ...");
                return null;
            }
        });
        Sayer proxySayer = (Sayer) enhancer.create();
        proxySayer.say();
    }

    private static void classProxy() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Dog.class);
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                System.out.println("hehe");
                return null;
            }
        });
        Dog proxyDog = (Dog) enhancer.create();
        proxyDog.say();
    }
}

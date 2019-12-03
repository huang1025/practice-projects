package com.huang.practice.base._03_genericity;

/**
 * GenericityTest -
 *
 * @author: huang_jiangling
 * @date: 2019/12/3
 **/
public class GenericityTest2<A, B, C> {

//  public static A method1(){} Error:(11, 17) java: 无法从静态上下文中引用非静态 类型变量 A

    public A method2(B b,C c){
        return null;
    }

    private B b;
}

package com.huang.practice.base._03_genericity;

/**
 * GenericityTest -
 *
 * @author: huang_jiangling
 * @date: 2019/12/3
 **/
public class GenericityTest8 {

    class A {
    }

    interface B {
    }

    interface C {
    }

    class D<T extends A & B & C> {
    }
}

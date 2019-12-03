package com.huang.practice.base._03_genericity;

/**
 * GenericityTest -
 *
 * @author: huang_jiangling
 * @date: 2019/12/3
 **/
public class GenericityTest {

    public class ClassA<T> {
    }

    public class SonOfClassA extends ClassA<String> {
    }

    public class SonOfClassA2<T> extends ClassA<T> {
    }

    public interface InterfaceA<A, B, C> {
    }

    public class SonOfInterfaceA<B, C> implements InterfaceA<String, B, C> {
    }

    public class SonOfInterfaceA2<D, E, F, G, H> implements InterfaceA<String, D, H> {
    }
}

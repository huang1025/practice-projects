package com.huang.practice.base._02_type;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.List;

/**
 * TypeTest -
 *
 * @author: huang_jiangling
 * @date: 2019/12/3
 **/
public class TypeTest {

    public static <T> void test(
            TypeTest typeTest,
            int age,
            T t,
            List<T> list,
            T[] array1,
            List<T>[] array2,
            List<? extends TypeTest> list2
    ) {
    }

    public static void main(String[] args) {
        Method[] methods = TypeTest.class.getMethods();
        Method method = null;
        for (Method each : methods) {
            if (each.getName().equals("test")) {
                method = each;
                break;
            }
        }

        Type[] genericParameterTypes = method.getGenericParameterTypes();
        for (Type each : genericParameterTypes) {
            System.out.println(each.getTypeName() + "->" + each.getClass().getSimpleName());
        }
    }
}

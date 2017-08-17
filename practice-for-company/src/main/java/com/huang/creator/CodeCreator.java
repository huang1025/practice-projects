package com.huang.creator;

import com.huang.creator.domain.FieldDto;
import com.huang.creator.util.PropertiesUtil;
import com.sun.javafx.binding.StringFormatter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by huang_jiangling on 2017/8/16.
 */
public class CodeCreator {

    private List<FieldDto> fieldDtoList = new ArrayList<>();

    public static CodeCreator create(Class clazz) {
        System.out.println("\n\n");
        System.out.println("===========================");
        System.out.println("字段；");
        System.out.println("===========================");
        CodeCreator codeCreator = new CodeCreator();
        codeCreator.fieldDtoList = PropertiesUtil.getAllProperties(clazz);
        return codeCreator;
    }

    /**
     * 打印字段；
     */
    public CodeCreator printFields() {
        for (FieldDto each : fieldDtoList) {
            String value = StringFormatter.format("private %s %s;", each.getFieldType(), each.getFieldName()).getValue();
            System.out.println(value);
        }
        return this;
    }

    /**
     * 打印 列名->字段名
     * <columnOverride column="create_time" property="createTime" />
     */
    public CodeCreator pringColumnChangeField() {
        System.out.println("\n\n");
        System.out.println("===========================");
        System.out.println("列名->字段名");
        System.out.println("===========================");
        for (FieldDto each : fieldDtoList) {
            String value = StringFormatter.format("<columnOverride column=\"%s\" property=\"%s\" />", each.getColumn(), each.getFieldName()).getValue();
            System.out.println(value);
        }
        return this;
    }

    /**
     * 打印 列名->javaType
     * <columnOverride column="" javaType="Double"/>
     */
    public CodeCreator printColumnChangeJavaType() {
        System.out.println("\n\n");
        System.out.println("===========================");
        System.out.println("列名->javaType");
        System.out.println("===========================");
        for (FieldDto each : fieldDtoList) {
            String value = StringFormatter.format("<columnOverride column=\"%s\" javaType=\"%s\" />", each.getColumn(), each.getFieldType()).getValue();
            System.out.println(value);
        }
        return this;
    }
}

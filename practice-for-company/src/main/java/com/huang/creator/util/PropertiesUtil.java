package com.huang.creator.util;

import com.huang.creator.domain.FieldDto;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by huang_jiangling on 2017/8/16.
 */
public class PropertiesUtil {

    public static List<FieldDto> getAllProperties(Class clazz) {
        List<FieldDto> fieldDtoList = new ArrayList<>();

        try {
            BeanInfo beanInfo = Introspector.getBeanInfo(clazz);
            PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
            for (PropertyDescriptor each : propertyDescriptors) {
                String name = each.getName();
                String type = each.getPropertyType().getSimpleName();

                FieldDto dto = new FieldDto(name, type);
                fieldDtoList.add(dto);
            }
        } catch (IntrospectionException e) {
            e.printStackTrace();
        }
        return fieldDtoList;
    }
}

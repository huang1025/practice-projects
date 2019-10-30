package com.huang.practice.spring.base.spring.validate;

import com.huang.practice.spring.base.spring.model.Employee;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

/**
 * Created by huang_jiangling on 2017/9/18.
 */
public class EmployeeValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return Employee.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Employee employee = (Employee) target;
        if (!"huang_jiangling".equals(employee.getName())) {
            errors.reject("您输入的名称不够大气；");
        }
    }
}

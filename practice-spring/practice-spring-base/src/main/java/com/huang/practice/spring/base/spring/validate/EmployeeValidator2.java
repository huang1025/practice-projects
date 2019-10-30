package com.huang.practice.spring.base.spring.validate;

import com.huang.practice.spring.base.spring.model.Employee;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

/**
 * Created by huang_jiangling on 2017/9/18.
 */
public class EmployeeValidator2 implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return Employee.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Employee employee = (Employee) target;
        if (17 != employee.getAge()) {
            errors.rejectValue("age", "不是17岁吗？");
        }
    }
}

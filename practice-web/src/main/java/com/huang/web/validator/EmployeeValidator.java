package com.huang.web.validator;

import com.huang.base.dto.Employee;
import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

/**
 * Created by huang on 2017/5/31.
 */
public class EmployeeValidator implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return Employee.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Employee employee = (Employee) target;
        if (employee == null) {
            errors.reject("员工对象不能为空;");
        } else if (StringUtils.isEmpty(employee.getName())) {
            errors.reject("员工名称不能为空");
        }
    }
}

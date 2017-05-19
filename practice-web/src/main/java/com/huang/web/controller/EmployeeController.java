package com.huang.web.controller;

import com.huang.base.dto.Employee;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by huang on 2017/5/18.
 */
@RestController
@RequestMapping(value = "employee")
public class EmployeeController {

    @RequestMapping(value = "save", method = RequestMethod.POST, consumes = "application/json")
    public Employee save(@RequestBody Employee employee) {
        employee.setAge(employee.getAge() + 1);
        employee.setName("hello " + employee.getName());
        return employee;
    }
}

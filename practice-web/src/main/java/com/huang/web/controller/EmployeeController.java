package com.huang.web.controller;

import com.huang.base.dto.Employee;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * Created by huang on 2017/5/18.
 */
@RestController
@RequestMapping(value = "employee")
public class EmployeeController extends BaseController {

    @RequestMapping(value = "save", method = RequestMethod.POST, consumes = "application/json", produces = "application/json;charset=UTF-8")
    public Employee save(@RequestBody @Valid Employee employee) {
        employee.setAge(employee.getAge() + 1);
        employee.setName("hello " + employee.getName());
        return employee;
    }
}

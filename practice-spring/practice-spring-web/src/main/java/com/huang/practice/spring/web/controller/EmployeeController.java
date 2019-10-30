package com.huang.practice.spring.web.controller;

import com.huang.practice.base.dto.Employee;
import com.huang.practice.base.dto.validate.groups.FirstGroup;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by huang on 2017/5/18.
 */
@RestController
@RequestMapping(value = "employee")
public class EmployeeController extends BaseController {

    @RequestMapping(value = "save", method = RequestMethod.POST, consumes = "application/json", produces = "application/json;charset=UTF-8")
    public String save(@RequestBody @Validated({FirstGroup.class}) Employee employee) {
        return "hello " + employee.getName() + ", you are " + employee.getAge() + " year old;";
    }
}

package com.huang.practice.spring.web.controller;

import com.huang.practice.base.dto.validate.validator.EmployeeValidator;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by huang on 2017/5/19.
 */
public class BaseController {

    @InitBinder
    public void initBinder(WebDataBinder webDataBinder) {
        webDataBinder.addValidators(new EmployeeValidator());
    }

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public String exceptionHandler(Exception e) {
        e.printStackTrace();
        return "正在维修中(" + e.getMessage() + ")";
    }
}

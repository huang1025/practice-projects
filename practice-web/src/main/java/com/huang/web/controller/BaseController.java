package com.huang.web.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by huang on 2017/5/19.
 */
public class BaseController {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public String exceptionHandler(Exception e) {
        e.printStackTrace();
        return "正在维修中" + e.getMessage();
    }
}

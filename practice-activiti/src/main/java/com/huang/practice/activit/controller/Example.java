package com.huang.practice.activit.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by huang on 2017/7/1.
 */
@RestController
public class Example {

    @RequestMapping("/")
    public String home() {
        return "Hello World!";
    }

}
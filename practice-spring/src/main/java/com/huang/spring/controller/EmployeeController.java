package com.huang.spring.controller;

import com.huang.spring.aop.IntroducerService;
import com.huang.spring.service.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by huang on 2017/7/13.
 */
@RestController
@RequestMapping("employee")
public class EmployeeController {
    private static final Logger log = LoggerFactory.getLogger(EmployeeController.class);

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private IntroducerService introducerService;

    @RequestMapping("getName")
    public String getName(@RequestBody int id) {
        log.info("================================");

        log.info("autowired employeeservice :" + employeeService);
        log.info("introducerService:" + introducerService.introduce());
        log.info("introducerService:" + introducerService.introduce2());

        EmployeeService service = (EmployeeService) introducerService;
        log.info("introducerService -> employeeService :" + service.getEmployeeName(id));

        IntroducerService introducer = (IntroducerService) employeeService;
        log.info("employeeService->introduceService :" + introducer.introduce());

        log.info("================================");
        return employeeService.getEmployeeName(id);
    }
}

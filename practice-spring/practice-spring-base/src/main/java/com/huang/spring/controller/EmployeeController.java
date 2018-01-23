package com.huang.spring.controller;

import com.huang.spring.aop.IntroducerService;
import com.huang.spring.model.Employee;
import com.huang.spring.service.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping({"getName", "getname", "name"})
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

    @RequestMapping(method = RequestMethod.POST, value = "{hehe}/{haha}/{xixi}")
    public String pathVariable(@PathVariable String hehe,
                               @PathVariable("haha") String hahaha,
                               @PathVariable("xixi") String xixi) {

        return hehe + "/" + hahaha + "/" + xixi;
    }

    @RequestMapping(value = "employee", method = RequestMethod.POST)
    public Employee employee(Employee employee) {
        return employee;
    }

    @RequestMapping(method = RequestMethod.POST, value = "requestParam")
    public String requestParam(@RequestParam String name,
                               @RequestParam int age) {
        return name + age;
    }
}

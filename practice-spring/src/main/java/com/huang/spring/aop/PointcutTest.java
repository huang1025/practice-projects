package com.huang.spring.aop;

import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Created by huang on 2017/7/13.
 */
@Aspect
@Component
public class PointcutTest {
    private static final Logger log = LoggerFactory.getLogger(PointcutTest.class);

    @Pointcut("execution(* com.huang.spring.service.EmployeeService.*(..))")
    public void pointcut() {
    }

    @Before("pointcut()")
    public void before() {
        System.out.println("advice before is running...");
        log.info("advice before is running...");
    }

    @Before("pointcut()")
    public void before2() {
        System.out.println("advice before2 is running...");
        log.info("advice before2 is running...");
    }

    @AfterReturning("execution(* com..EmployeeService.*(..))&&args(id,name)")
    public void after(String name, int id) {
        log.info("after-returning,id:" + id);
        log.info("advice after is running...");
    }

    @DeclareParents(value = "com.huang.spring.service.EmployeeService", defaultImpl = IntroducerServiceImpl.class)
    public IntroducerService introducerService;
}

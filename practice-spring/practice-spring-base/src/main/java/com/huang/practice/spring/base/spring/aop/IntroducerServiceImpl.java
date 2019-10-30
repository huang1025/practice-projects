package com.huang.practice.spring.base.spring.aop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by huang on 2017/7/13.
 */
public class IntroducerServiceImpl implements IntroducerService {
    private static final Logger log = LoggerFactory.getLogger(IntroducerServiceImpl.class);

    @Override
    public String introduce() {
        log.info("IntroducerServiceImpl->introduce1...");
        return "IntroducerServiceImpl->introduce1";
    }

    @Override
    public String introduce2() {
        log.info("IntroducerServiceImpl->introduce2...");
        return "IntroducerServiceImpl->introduce2";
    }
}

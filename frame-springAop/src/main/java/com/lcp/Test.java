package com.lcp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lcp.service.TestService;

public class Test {

    public static void main(String[] args){
        ApplicationContext appCtx = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
        TestService sleeper = (TestService)appCtx.getBean("aopProxy");
        sleeper.testAop("","");
    }
}
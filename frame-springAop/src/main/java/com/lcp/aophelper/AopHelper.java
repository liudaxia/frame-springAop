package com.lcp.aophelper;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

public class AopHelper implements MethodBeforeAdvice, AfterReturningAdvice {

	
	public void before(Method arg0, Object[] arg1, Object arg2)
			throws Throwable {
		System.out.println("睡觉之前先剥光，裸睡有益身心健康--希望不会梦游");

	}
	public void afterReturning(Object arg0, Method arg1, Object[] arg2,
			Object arg3) throws Throwable {
		System.out.println("睡完觉后该起床，睡睡懒觉也无妨 O(∩_∩)O");
	}

	

}

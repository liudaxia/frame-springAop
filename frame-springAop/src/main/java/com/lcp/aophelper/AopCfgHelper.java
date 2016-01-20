package com.lcp.aophelper;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class AopCfgHelper {

	public void doBefore(JoinPoint joinPoint) throws Throwable {
		Object[] params=joinPoint.getArgs();
		System.out.println("AopCfgHelper doBefore params="+params);
		System.out.println("睡觉之前先剥光，裸睡有益身心健康--希望不会梦游");

	}

	public void doAfter(JoinPoint joinPoint) throws Throwable {
		Object[] params=joinPoint.getArgs();
		System.out.println("AopCfgHelper doAfter params="+params);
		System.out.println("睡完觉后该起床，睡睡懒觉也无妨 O(∩_∩)O");
	}

}

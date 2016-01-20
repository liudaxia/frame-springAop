package com.lcp.service.impl;

import org.springframework.stereotype.Service;

import com.lcp.service.TestService;
@Service
public class TestServiceImpl implements TestService {

	public String TestName(String name) {
		System.out.println("SpringAop TestServiceImpl TestName params:"+name);
		String word=name+":I'm coming";
		return word;
	}

	public void testAop(String params1,String params2) {
		System.out.println("SpringAop TestServiceImpl testAopstart..");
		System.out.println("SpringAop TestServiceImpl params1="+params1+"&&params2="+params2);
		System.out.println("是时候做点正事了，睡个好觉吧，梦中自有颜如玉(*@ο@*) ");
	}
	
	
}

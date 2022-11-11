package com.cjc.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		System.out.println("main--start");
		ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml"); //3
//		User user = context.getBean("user",User.class);
//		user.m1();
		System.out.println("Main--end");
	}
}

package com.cjc.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		System.out.println("Main---Start");
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		User u1 = context.getBean("user", User.class);
		u1.setUid(111);
		u1.setUname("AAA");

		User u2 = context.getBean("user", User.class);
		u2.setUid(222);
		u2.setUname("BBB");
		
		u1.bookTickit(u1);
		u2.bookTickit(u2);
		System.out.println("Main--End");
	}
}

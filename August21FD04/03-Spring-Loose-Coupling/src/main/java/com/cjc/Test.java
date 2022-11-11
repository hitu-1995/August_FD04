package com.cjc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
		
	Mobile mobile = context.getBean("mob",Mobile.class);
		
		  mobile.simOperation();
		
	}
}

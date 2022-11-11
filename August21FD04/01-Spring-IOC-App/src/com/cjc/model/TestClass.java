package com.cjc.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestClass {

	public static void main(String[] args) {
		
		ApplicationContext context=new FileSystemXmlApplicationContext("D:\\bean.xml");
		  
	     Engine emp = context.getBean("eng",Engine.class);
	     
		System.out.println("Main--End");
	}
}

package com.cjc.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cjc.model.Car;
import com.cjc.model.Engine;

public class Test {

	public static void main(String[] args) {
		
	ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
		Car car = context.getBean("car",Car.class);
		car.drive();
	}
}

package com.cjc.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cjc.configue.AppConfigue;
import com.cjc.model.Student;

public class Test {

	public static void main(String[] args) {
		System.out.println("Main ---Method");
		ApplicationContext context=
				new AnnotationConfigApplicationContext(AppConfigue.class);
		Student student = context.getBean("stu1",Student.class);               //3
		System.out.println("Main--End");
	}
}

package com.cjc.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.cjc.configue.AppConfigue;
import com.cjc.model.Client;

public class Test {

	public static void main(String[] args) {              //3
		System.out.println("Main--Start");
		ApplicationContext context=
				  new AnnotationConfigApplicationContext(AppConfigue.class);
		
		Client client = context.getBean("client",Client.class);
		client.checkClient();
		System.out.println("main--end");
	}
}

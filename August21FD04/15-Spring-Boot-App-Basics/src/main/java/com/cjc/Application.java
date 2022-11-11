package com.cjc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
	ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
	   System.out.println("------------------------------");
	   System.out.println(context.getBeanDefinitionCount());
	   System.out.println("------------------------------");
		System.out.println("*** Main-------End  ***");
	}

}

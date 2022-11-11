package com.cjc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.expression.spel.ast.OpPlus;

import com.cjc.service.StudentDBOperations;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
	     StudentDBOperations operations = context.getBean(StudentDBOperations.class);
	     operations.saveStudent();
   		  // use switch cases
		
	}

}

package com.cjc.configue;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.cjc.model.Student;

@Configuration
public class AppConfigue {

	@Bean(name = "stu1")
	public Student getstu() {
	System.out.println("getStu Executed");   //2
		return new Student();
	}
}

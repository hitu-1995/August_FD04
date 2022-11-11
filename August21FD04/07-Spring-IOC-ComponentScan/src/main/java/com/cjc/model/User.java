package com.cjc.model;

import org.springframework.stereotype.Component;

@Component
public class User {  // User user=new User();

	public User() {
		System.out.println("User :: Constructor");  // 1
	}
	
	
	public void m1() {
		System.out.println("m1--method--User");
	}
}

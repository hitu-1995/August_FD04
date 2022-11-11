package com.cjc.model;

import org.springframework.stereotype.Component;

@Component
public class Client {     //1

	public Client() {
		System.out.println("Client :: Constructor");
	}
	
	public void checkClient() {
		
		System.out.println("Client :: Method");
	}
}

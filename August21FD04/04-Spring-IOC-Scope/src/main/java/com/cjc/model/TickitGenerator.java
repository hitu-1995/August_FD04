package com.cjc.model;

public class TickitGenerator {

	public TickitGenerator() {
		System.out.println("TickitGenerator :: Constructor");
	}
	public void bookTickit(User user) {
		
		System.out.println("Your Tickit is Booked for User Name : "+user.getUname()+
				" User ID : "+user.getUid());
	}
	
}

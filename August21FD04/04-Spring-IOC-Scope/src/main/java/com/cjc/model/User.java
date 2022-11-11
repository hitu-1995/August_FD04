package com.cjc.model;

public class User {

	private TickitGenerator generator;
	private int uid;
	private String uname;

	// book tickit
	public void bookTickit(User user) {
		  // this method is from TickitGenerator class
		generator.bookTickit(user);
	}

	public void setUid(int uid) {
		this.uid = uid;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public void setGenerator(TickitGenerator generator) {
		this.generator = generator;
	}
	public TickitGenerator getGenerator() {
		return generator;
	}
	public int getUid() {
		return uid;
	}
	public String getUname() {
		return uname;
	}
	
}

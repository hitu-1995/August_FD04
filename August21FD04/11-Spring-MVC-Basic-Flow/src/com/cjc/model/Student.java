package com.cjc.model;

public class Student {

	private String uname;
	private String pass;
	private String name;
	private String addr;
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	@Override
	public String toString() {
		return "Student [uname=" + uname + ", pass=" + pass + ", name=" + name + ", addr=" + addr + "]";
	}
	
	
}

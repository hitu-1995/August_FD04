package com.cjc.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {

	@Id
	private int uid;
	private String uname;
	private String uaddress;
	public User() {
		// TODO Auto-generated constructor stub
	}
	public User(int uid, String uname, String uaddress) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.uaddress = uaddress;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUaddress() {
		return uaddress;
	}
	public void setUaddress(String uaddress) {
		this.uaddress = uaddress;
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + ", uaddress=" + uaddress + "]";
	}
	
	
}

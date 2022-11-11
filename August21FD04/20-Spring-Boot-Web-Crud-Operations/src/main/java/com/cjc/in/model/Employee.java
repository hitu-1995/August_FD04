package com.cjc.in.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Setter
@Getter
@ToString
public class Employee {

	@Id
	private int eid;
	private String ename;
	private String eaddress;
	private String edesig;
	private String uname;
	private String pass;
	
	
	
	
}

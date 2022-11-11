package com.cjc.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {    //1

	@Id
	private int rollno;
	private String name;
	private double marks;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student Rollno : " + rollno + 
				"  Name:  " + name + " Marks : " + marks + "\n";
	}
	
}

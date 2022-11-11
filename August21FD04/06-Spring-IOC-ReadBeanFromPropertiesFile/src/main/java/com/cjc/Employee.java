package com.cjc;

public class Employee {

	private int empId;
	private String ename;
	private String eaddress;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {          // 1
		this.empId = empId;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEaddress() {
		return eaddress;
	}
	public void setEaddress(String eaddress) {
		this.eaddress = eaddress;
	}
	
}

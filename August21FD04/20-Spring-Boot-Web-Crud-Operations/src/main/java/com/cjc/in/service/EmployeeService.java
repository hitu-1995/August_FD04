package com.cjc.in.service;

import com.cjc.in.model.Employee;

public interface EmployeeService {

	public void saveEmployee(Employee employee);
	public Employee loginCheck(String uname,String pass);
	
}

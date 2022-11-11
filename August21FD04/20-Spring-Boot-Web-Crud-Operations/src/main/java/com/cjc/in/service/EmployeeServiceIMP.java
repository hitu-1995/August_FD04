package com.cjc.in.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.in.dao.EmployeeDao;
import com.cjc.in.model.Employee;

@Service
public class EmployeeServiceIMP implements EmployeeService{

	@Autowired
	private EmployeeDao empDao;
	
	@Override
	public void saveEmployee(Employee employee) {
		
		empDao.save(employee);
	}

	@Override
	public Employee loginCheck(String uname, String pass) {
		   Employee employee = empDao.findByUnameAndPass(uname, pass);
		   
		return employee;
	}

}

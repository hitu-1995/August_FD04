package com.cjc.in.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cjc.in.model.Employee;
import com.cjc.in.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService service;

	@RequestMapping("/")
	public String landingPage() {

		return "login";
	}

	@RequestMapping("/log")
	public String login(@RequestParam("uname") String uname, @RequestParam("pass") String pass) {
    
	        Employee employee = service.loginCheck(uname, pass);
	   
	            System.out.println(employee);
		return "success";
	}

	@RequestMapping("/register")
	public String registerEmployee() {

		return "registration";
	}

	@RequestMapping("/reg")
	public String insertEmployee(@ModelAttribute Employee employee) {
		System.out.println(employee);
         service.saveEmployee(employee);
         
		return "login";
	}

}

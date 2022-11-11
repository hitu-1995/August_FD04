package com.cjc.web.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cjc.web.crud.model.Student;
import com.cjc.web.crud.service.HomeService;
@Controller
public class HomeController {

	 @Autowired
	  HomeService hs;

	 public HomeController() {
		System.out.println("HomeController :: Initialized");
	}
	@RequestMapping("/")
	public String preLogin() {
		System.out.println("landing page ...........");
		return "index";
	}
	
	@RequestMapping("/log")
	public String  login(@RequestParam("uname") String uname,@RequestParam("pass") String pass,ModelMap m) {
	System.out.println("Login Method Called............");
	
	    List<Student> list = hs.loginChech(uname, pass);
	    
	    if(list!=null) {
	    	m.addAttribute("data",list);
	    	return "success";
	    }
	    else
	      return "index";
	}
	
	@RequestMapping("/reg")
	public String registration() {
		
		return "register";
	}
	@RequestMapping("/register")
	public String  register(@ModelAttribute Student stu) {
		System.out.println("Registration Completed");
		hs.saveStudent(stu);
		
		return "index";
	}
	
	@RequestMapping("/edit")
	public String editStudent(@RequestParam int id,ModelMap m) {
		System.out.println("edit controller called------  "+id);
		Student stu = hs.editStu(id);
		m.addAttribute("data",stu);
		return "edit";
	}
	
	@RequestMapping("/delete")
	public String deleteStudent(@RequestParam int id,ModelMap m) {
		System.out.println("Delete Controller Called------");
		List<Student> list= hs.deleteStu(id);
		m.addAttribute("data",list);
		return "success";
	}
	
	
	@RequestMapping("/add")
	public String addStudent() {
		System.out.println("add Controller Called----------");
		return "success";
	}
	
	
}

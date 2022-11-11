package com.cjc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cjc.model.Student;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String landingPage() {

		return "index.jsp";
	}

	@RequestMapping("/log")
	public String login() {

		System.out.println("you are in login() method");
		return "login.jsp";
	}

	@RequestMapping("/loginCheck")
	public String loginCheck(@RequestParam("userName") String uname, @RequestParam("pass") String pass) {
		System.out.println("User Name : " + uname + "    Passward : " + pass);

		if (uname.equalsIgnoreCase("admin") && pass.equalsIgnoreCase("admin")) {
			return "register.jsp";
		}
		{
			System.out.println("index..page loading.........");
			return "index.jsp";

		}

	}

	@RequestMapping("/reg")
	public String registerUser() {
		System.out.println("registerUser() Method.......");
		return "register.jsp";
	}

	@RequestMapping("/register")
	public String saveUser(@ModelAttribute("stu") Student st, ModelMap map) {
		System.out.println(st);

		map.addAttribute("stu1", st);
		return "success.jsp";
	}

}

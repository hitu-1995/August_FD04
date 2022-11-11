package com.cjc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String preLogin() {
		
	  return "index";	
	}
	
	@RequestMapping("/log")
	public String  login(@RequestParam("un") String uname,@RequestParam("ps") String pass ,ModelMap m) {
		
		System.out.println("un "+uname+"  ps  "+pass);
		m.addAttribute("un", uname);
		m.addAttribute("ps", pass);
		
		return "success";
	}
	
}

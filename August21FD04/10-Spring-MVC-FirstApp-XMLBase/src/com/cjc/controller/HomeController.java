package com.cjc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

	@RequestMapping("/log")
	//@ResponseBody
	public String login() {
		System.out.println("in Login Method ");   //3
		return "success";
	}
}

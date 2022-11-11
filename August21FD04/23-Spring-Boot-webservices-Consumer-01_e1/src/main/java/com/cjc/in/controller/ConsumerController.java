package com.cjc.in.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {

	@Autowired
	private RestTemplate template;

	@RequestMapping("/getConsumeData")
	public List  getConsumeData() {

		String url="http://localhost:9091/getProduceData";
	
		List list = template.getForObject(url, List.class);
		
		return list;
	}
}

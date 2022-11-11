package com.cjc.in.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cjc.in.model.Student;

@RestController
public class ConsumerController {

	

	@Autowired
	private RestTemplate templete;

	@RequestMapping("/getConsumeData")
	public List updateProduceData() {
		System.out.println("ConsumerController :: updateProduceData method called....");
		
		String url="http://localhost:9091/getProduceData";
		
		List list = templete.getForObject(url,List.class);
		
		

		//service.insertStudent(list);
		System.out.println("Data Added");
		
		return list;
	}
	

	

}

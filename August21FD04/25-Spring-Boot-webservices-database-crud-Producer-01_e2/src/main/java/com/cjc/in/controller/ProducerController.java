package com.cjc.in.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cjc.in.model.Student;
import com.cjc.in.service.ProducerService;

@RestController
public class ProducerController {

	@Autowired
	private ProducerService service;

	@RequestMapping("/")
	public String updateList() {

		List list = Arrays.asList(new Student(103, "Akash", "Akurdi"),
				new Student(104, "Nilesh", "Talegaon"));

		service.insertStudent(list);
		System.out.println("Data Added");
		return "Data Added";
	}
	@RequestMapping("/getProduceData")
	public List getProduceData() {

		List list = service.getAllRecords();

		service.insertStudent(list);
		System.out.println("Data Added");
		return list;
	}

	
}

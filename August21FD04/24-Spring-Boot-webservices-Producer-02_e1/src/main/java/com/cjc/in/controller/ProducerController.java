package com.cjc.in.controller;

import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cjc.in.model.Student;

@RestController
public class ProducerController {

	@RequestMapping("/getProduceData")
	public List  getProduceData() {
		
	    List list = Arrays.asList(new Student(101, "Hitesh", "Akurdi"),
	    		new Student(102, "Nana", "Talegaon"));
	    
		return list;
	}
}

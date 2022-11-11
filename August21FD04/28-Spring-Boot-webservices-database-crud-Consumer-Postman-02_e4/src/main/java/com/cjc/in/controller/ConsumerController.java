package com.cjc.in.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cjc.in.model.Student;

@RestController
public class ConsumerController {

	@Autowired
	private RestTemplate templete;

	@PostMapping("/insertDataFromConsumer")
	public String updateProduceData(@RequestBody Student stu) {
		System.out.println("ConsumerController :: updateProduceData method called....");

		String url = "http://localhost:9091/insertData";

		String msg = templete.postForObject(url, stu, String.class);

		// service.insertStudent(list);
		System.out.println("Data Added");

		return msg;
	}

	@PostMapping("/insert")
	public String saveData(@RequestBody Student student) {
		System.out.println("ConsumerController :: saveData method called....");

		String url = "http://localhost:9091/getProduceData";

		String msg = templete.postForObject(url, student, String.class);

		msg = "Inserted Through Consumer";

		return msg;
	}

	@GetMapping("/getDataThroughConsumer")
	public List getAllData() {
		System.out.println("ConsumerController :: saveData method called....");

		String url = "http://localhost:9091/getDataFromProducer";

		List list = templete.getForObject(url, List.class);

		return list;
	}

	@PutMapping("/updateStudentThroughConsumer/{rollno}")
    public String updateData(@PathVariable int rollno,@RequestBody Student stu) {
		String url="http://localhost:9092/updateDataFromProducer/{"+rollno+"}";
	     templete.put(url, stu,rollno);
	
	   return "Updated Through Consumer";
	}
	
	@DeleteMapping("/deleteDataThroughConsumer/{rollno}")
    public String deleteData(@PathVariable int rno)
    {
		String url="http://localhost:9091/deleteDataFromProducer/{rollno}";
		templete.delete(url, rno);
  	  return "data deleted Successfully";
    }
}        

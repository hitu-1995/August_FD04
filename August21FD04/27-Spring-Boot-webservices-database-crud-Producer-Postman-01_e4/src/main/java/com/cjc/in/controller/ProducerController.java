package com.cjc.in.controller;

import java.util.Arrays;
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
import com.cjc.in.model.Student;
import com.cjc.in.service.ProducerService;

@RestController
public class ProducerController {

	@Autowired
	private ProducerService service;


	
      @PostMapping("/insertData")
	  public String saveData(@RequestBody Student stu) {
		
    	  service.insertStudentObj(stu);
    	  return "Data Inserted";
	}

      @GetMapping("/getDataFromProducer")
      public List getAlldata() {
		
    	  List list = service.getAllData();
    	  
    	  return list;
	} 
      
      @PutMapping("/updateDataFromProducer/{rollno}")
      public String updateData(@PathVariable int rollno,@RequestBody Student stu) {
    	  
    	 Student stu1= service.updateStudent(rollno,stu);  
    	  
    	 return "Data updated through Producer";
      }
      
      @DeleteMapping("/deleteDataFromProducer/{rollno}")
      public String deleteData(@PathVariable int rollno)
      {
    	  service.deletedata(rollno);
    	  return "data deleted Successfully";
      }
      
	
}


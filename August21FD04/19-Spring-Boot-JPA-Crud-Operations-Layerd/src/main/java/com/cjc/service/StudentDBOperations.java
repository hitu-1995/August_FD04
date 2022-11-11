package com.cjc.service;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cjc.dao.StudentRepo;
import com.cjc.model.Student;
   // service layer
@Component
public class StudentDBOperations {
	  @Autowired
	  private StudentRepo repo;
	
	public void saveStudent() {
	  Scanner sc=new Scanner(System.in);
	  Student stu=new Student();
	  System.out.println("Enter Rollno ");
	  stu.setRollno(sc.nextInt());
	  System.out.println("Enter Name ");
	  stu.setName(sc.next());
	  System.out.println("Enter Marks ");
	  stu.setMarks(sc.nextDouble());
	    repo.save(stu);
	    System.out.println("*** Student Inserted ***");
	}
}

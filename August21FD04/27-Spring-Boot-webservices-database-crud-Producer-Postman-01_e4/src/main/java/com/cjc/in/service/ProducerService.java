package com.cjc.in.service;

import java.util.List;

import com.cjc.in.model.Student;

public interface ProducerService {



	public void insertStudentObj(Student stu);

	public List getAllData();

	public Student updateStudent(int rollno, Student stu);

	public void deletedata(int rollno);
	
}

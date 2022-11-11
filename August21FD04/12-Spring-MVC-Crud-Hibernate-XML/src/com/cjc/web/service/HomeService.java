package com.cjc.web.service;

import java.util.List;

import com.cjc.web.model.Student;

public interface HomeService {

	public void saveStudent(Student stu);
	
	public List<Student> loginChech(String uname,String pass);

	public Student editStu(int id);

	public List<Student> deleteStu(int id);
	
}

package com.cjc.web.crud.dao;

import java.util.List;

import com.cjc.web.crud.model.Student;

public interface HomeDao {

	public void saveStudent(Student stu);
	
	public List<Student> loginChech(String uname,String pass);

	public Student editStu(int id);

	public List<Student> deleteStu(int id);
}

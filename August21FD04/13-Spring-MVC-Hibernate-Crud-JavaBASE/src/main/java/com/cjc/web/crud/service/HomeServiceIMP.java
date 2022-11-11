package com.cjc.web.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.web.crud.dao.HomeDao;
import com.cjc.web.crud.model.Student;

@Service
public class HomeServiceIMP implements HomeService{

	@Autowired
	HomeDao hd;

	public void saveStudent(Student stu) {
		
		hd.saveStudent(stu);
	}

	public List<Student> loginChech(String uname, String pass) {
		
		return hd.loginChech(uname, pass);
	}

	public Student editStu(int id) {
		
		return hd.editStu(id);
	}

	public List<Student> deleteStu(int id) {
	
		return hd.deleteStu(id);
	}
}

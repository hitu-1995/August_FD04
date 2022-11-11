package com.cjc.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.web.dao.HomeDao;
import com.cjc.web.model.Student;

@Service
public class HomeServiceIMP implements HomeService{

	@Autowired
	HomeDao hd;
	
//	public void setDao(HomeDao dao) {
//		this.dao = dao;
//	}

	@Override
	public void saveStudent(Student stu) {
		// Buisiness Logic
		
		hd.saveStudent(stu);
	}

	@Override
	public List<Student> loginChech(String uname, String pass) {
		
		List<Student> list = hd.loginChech(uname, pass);
		
		return list;
	}

	@Override
	public Student editStu(int id) {

		return hd.editStu(id);
	}

	@Override
	public List<Student> deleteStu(int id) {
		// TODO Auto-generated method stub
		return 	 hd.deleteStu(id);
	}
}

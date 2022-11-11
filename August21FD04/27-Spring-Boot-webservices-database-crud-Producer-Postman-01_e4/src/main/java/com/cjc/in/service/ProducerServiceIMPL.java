package com.cjc.in.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.in.dao.ProducerReository;
import com.cjc.in.model.Student;

@Service
public class ProducerServiceIMPL implements ProducerService {

	@Autowired
	private ProducerReository repo;

	@Override
	public void insertStudentObj(Student stu) {

		repo.save(stu);

	}

	@Override
	public List getAllData() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Student updateStudent(int rollno, Student stu) {

		Student s = repo.findById(rollno).get();

		s = stu;

		repo.save(s);

		return s;
	}

	@Override
	public void deletedata(int rollno) {
		repo.deleteById(rollno);
		
	}

}

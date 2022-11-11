package com.cjc.in.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.in.dao.ProducerReository;

@Service
public class ProducerServiceIMPL implements ProducerService{

	@Autowired
	private ProducerReository repo;
	
	@Override
	public void insertStudent(List list) {
	 
		 repo.saveAll(list);
		
	}

	@Override
	public List getAllRecords() {
		
		return repo.findAll();
	}

}

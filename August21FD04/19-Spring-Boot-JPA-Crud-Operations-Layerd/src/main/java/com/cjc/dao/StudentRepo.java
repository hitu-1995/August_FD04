package com.cjc.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.cjc.model.Student;
   // dao layer
@Component
public interface StudentRepo extends CrudRepository<Student,Integer>{

}

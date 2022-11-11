package com.cjc.in.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.in.model.Student;

@Repository
public interface ProducerReository extends JpaRepository<Student, Integer>{

}

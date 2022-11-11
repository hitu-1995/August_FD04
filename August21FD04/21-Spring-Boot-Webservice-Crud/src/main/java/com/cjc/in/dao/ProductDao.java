package com.cjc.in.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.in.model.Product;

@Repository
public interface ProductDao extends JpaRepository<Product,Integer>{

}

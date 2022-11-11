package com.cjc.in.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.in.dao.ProductDao;
import com.cjc.in.model.Product;
@Service
public class ProductServiceIMPL implements ProductService{

	@Autowired
	private ProductDao dao;
	
	@Override
	public void saveProduct(Product product) {
	      dao.save(product);
	}

	@Override
	public Product getProduct(int pid) {
		Product product= dao.findById(pid).get();
		return product;
	}

	@Override
	public boolean deleteProduct(int pid) {
		dao.deleteById(pid);
		
		boolean flag = dao.existsById(pid);
	    return flag;
	}

}

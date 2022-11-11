package com.cjc.in.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.cjc.in.model.Product;
import com.cjc.in.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService service;

	@PostMapping("/insertProduct")
	public String insertData(@RequestBody Product product) {
		System.out.println(product);
		  service.saveProduct(product);
		
		return "Data Inserted";
	}
	
	@GetMapping("/retrive/{pid}")
	public Product getData(@PathVariable int pid) {
		
		Product product= service.getProduct(pid);
		
		return product;
	}
	
	@PutMapping("/update")
	public String updateData(@RequestBody Product product) {
		   service.saveProduct(product);
		return "Data-Updated";
	}
	
	@DeleteMapping("/delete/{pid}")
	public boolean deleteData(@PathVariable int pid) {
	
		boolean flag=service.deleteProduct(pid);
		if(flag)   //false
		return false;
		else 
	    return flag;
	}
	
}

package com.cjc.in.service;

import com.cjc.in.model.Product;

public interface ProductService {

	public void saveProduct(Product product);

	public Product getProduct(int pid);

	public boolean deleteProduct(int pid);
}

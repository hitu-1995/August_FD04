package com.cjc.in.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class Product {

	@Id
	private int p_id;
	private String p_name;
	private String p_brand;
	private int p_price;
	public int getP_id() {
		return p_id;
	}
	public void setP_id(int p_id) {
		this.p_id = p_id;
	}
	public String getP_name() {
		return p_name;
	}
	public void setP_name(String p_name) {
		this.p_name = p_name;
	}
	public String getP_brand() {
		return p_brand;
	}
	public void setP_brand(String p_brand) {
		this.p_brand = p_brand;
	}
	public int getP_price() {
		return p_price;
	}
	public void setP_price(int p_price) {
		this.p_price = p_price;
	}
	@Override
	public String toString() {
		return "Product [p_id=" + p_id + ", p_name=" 
	+ p_name + ", p_brand=" + p_brand + ", p_price=" + p_price + "]";
	}

	
}

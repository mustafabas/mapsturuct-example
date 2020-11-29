package com.mustafabasme.mapstruct.entity;

import java.math.BigDecimal;

public class ProductEntity {
	private int id;
	private String productName;
	private BigDecimal price;
	
	
	public ProductEntity() {
	
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	
	
}

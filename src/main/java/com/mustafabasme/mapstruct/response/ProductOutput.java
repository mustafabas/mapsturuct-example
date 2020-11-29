package com.mustafabasme.mapstruct.response;

public class ProductOutput {	
	
	private int productId;
	private String productName;
	private String productPrice;
	
	public ProductOutput() {

	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(String productPrice) {
		this.productPrice = productPrice;
	}

}

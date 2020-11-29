package com.mustafabasme.mapstruct.services;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mustafabasme.mapstruct.entity.ProductEntity;
import com.mustafabasme.mapstruct.mapper.ProductMapper;
import com.mustafabasme.mapstruct.response.ProductOutput;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductMapper productMapper;
	
	@Override
	public ProductOutput getProductById(int id) {
		ProductEntity productEntity = new ProductEntity();
		productEntity.setId(1);
		productEntity.setPrice(BigDecimal.TEN);
		productEntity.setProductName("Test Ürün");
		return productMapper.mapProductEntity2Output(productEntity);
	}

	
}

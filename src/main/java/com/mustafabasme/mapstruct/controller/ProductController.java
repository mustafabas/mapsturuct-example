package com.mustafabasme.mapstruct.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mustafabasme.mapstruct.response.ProductOutput;
import com.mustafabasme.mapstruct.services.ProductService;

@RestController
@RequestMapping("/api/product")
public class ProductController  {

	@Autowired
	ProductService productService;
	
	@GetMapping("")
		public ResponseEntity<ProductOutput> get(int id) {
		// TODO Auto-generated method stub
		return ResponseEntity.ok(productService.getProductById(id));
	}

}

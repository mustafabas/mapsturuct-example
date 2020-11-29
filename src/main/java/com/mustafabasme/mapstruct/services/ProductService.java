package com.mustafabasme.mapstruct.services;

import com.mustafabasme.mapstruct.response.ProductOutput;

public interface ProductService {
	
	ProductOutput getProductById(int id);
	
}

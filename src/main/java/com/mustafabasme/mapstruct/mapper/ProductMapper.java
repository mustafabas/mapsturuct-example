package com.mustafabasme.mapstruct.mapper;

import java.math.BigDecimal;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

import com.mustafabasme.mapstruct.entity.ProductEntity;
import com.mustafabasme.mapstruct.response.ProductOutput;

@Mapper(componentModel = "spring")
public interface ProductMapper {
	
	ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);

	
	@Mappings({@Mapping(source = "price", target = "productPrice", qualifiedByName = "priceToProductPrice"),
			@Mapping(source="id", target="productId")
	})
	public abstract ProductOutput mapProductEntity2Output(ProductEntity productEntity);
	
	@Named("priceToProductPrice")
	public static  String priceToProductPrice(BigDecimal price) {
		return price.toString()+" ₺";
	}

}

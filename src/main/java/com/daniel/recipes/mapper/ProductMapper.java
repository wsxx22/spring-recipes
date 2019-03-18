package com.daniel.recipes.mapper;

import com.daniel.recipes.dto.ProductDTO;
import com.daniel.recipes.entity.Product;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    ProductDTO toDTO (Product product);

    List<ProductDTO> toDTOList (List<Product> productList);

}

package com.daniel.recipes.mapper;

import com.daniel.recipes.dto.ProductDTO;
import com.daniel.recipes.entity.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.NullValueMappingStrategy;

import java.util.List;

@Mapper(componentModel = "spring", uses = {CategoryMapper.class}, nullValueMappingStrategy = NullValueMappingStrategy.RETURN_DEFAULT)
public interface ProductMapper {

//    @Mappings({
//            @Mapping(target = "categoryId", source = "category.id")
//    })
    ProductDTO toDTO (Product product);


    List<ProductDTO> toDTOList (List<Product> productList);

}

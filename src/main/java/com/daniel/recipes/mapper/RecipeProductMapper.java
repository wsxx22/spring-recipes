package com.daniel.recipes.mapper;

import com.daniel.recipes.dto.RecipeProductDTO;
import com.daniel.recipes.entity.RecipeProduct;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.NullValueMappingStrategy;

import java.util.List;
import java.util.Set;

@Mapper (componentModel = "spring", uses = {ProductMapper.class}, nullValueMappingStrategy = NullValueMappingStrategy.RETURN_DEFAULT) // uzywanie innego mapera
public interface RecipeProductMapper {

    @Mappings({
            @Mapping(target = "recipeId", source = "recipe.id")
//            @Mapping(target = "product", source = "product")
    })
    RecipeProductDTO toDTO (RecipeProduct recipeProduct);


    Set<RecipeProductDTO> toDTOSet (Set<RecipeProduct> recipeProductList);

}

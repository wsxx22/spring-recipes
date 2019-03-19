package com.daniel.recipes.mapper;


import com.daniel.recipes.dto.CategoryDTO;
import com.daniel.recipes.entity.Category;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CategoryMapper {

    CategoryDTO toDTO (Category category);

    List<CategoryDTO> toDTOList (List<Category> categoryList);

}

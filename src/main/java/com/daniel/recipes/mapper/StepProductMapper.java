package com.daniel.recipes.mapper;

import com.daniel.recipes.dto.StepProductDTO;
import com.daniel.recipes.entity.StepProduct;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;


@Mapper(componentModel = "spring")
public interface StepProductMapper {

    @Mappings({
            @Mapping(target = "stepId", source = "step.id"),
            @Mapping(target = "productId", source = "product.id")
    })
    StepProductDTO toDto (StepProduct stepProduct);

    List<StepProductDTO> toDtoList (List<StepProduct> stepProducts);

}

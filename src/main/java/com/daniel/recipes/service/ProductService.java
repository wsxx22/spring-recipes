package com.daniel.recipes.service;

import com.daniel.recipes.dto.ProductDTO;
import com.daniel.recipes.dto.UserDTO;
import com.daniel.recipes.entity.AbstractEntity;
import com.daniel.recipes.entity.Category;
import com.daniel.recipes.entity.Product;
import com.daniel.recipes.entity.User;
import com.daniel.recipes.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductService {

    private ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<ProductDTO> findAll(){
        return convertToDTO(productRepository.findAll());
    }

    public Product save(Product product) {
        return productRepository.save(product);
    }

    public List<ProductDTO> findByCategoryName(String name) {
        return convertToDTO(productRepository.findByCategoryName(name));
    }

    public List<ProductDTO> findByCategoryId(Long id) {
        return convertToDTO(productRepository.findByCategoryId(id));
    }

    private ProductDTO convertToDTO(Product product) {
//        ProductDTO productDTO = new ProductDTO();
//        product.setId(product.getId());
//        productDTO.setName(product.getName());
//        productDTO.setCategoryId(product.getCategory().getId());
//
//        productDTO.setRecipesId(product.getRecipes().stream().map(AbstractEntity::getId).collect(Collectors.toList()));

        return ProductDTO.builder()
                .id(product.getId())
                .name(product.getName())
                .categoryId(product.getCategory().getId())
                .recipesId(product.getRecipes().stream().map(AbstractEntity::getId).collect(Collectors.toList()))
                .build();
    }

    private List<ProductDTO> convertToDTO(List<Product> products) {
        return products.stream().map(this::convertToDTO).collect(Collectors.toList());
    }
}

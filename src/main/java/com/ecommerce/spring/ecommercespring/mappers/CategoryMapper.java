package com.ecommerce.spring.ecommercespring.mappers;

import com.ecommerce.spring.ecommercespring.dto.CategoryDTO;
import com.ecommerce.spring.ecommercespring.dto.CategoryWithProductsDTO;
import com.ecommerce.spring.ecommercespring.dto.ProductDTO;
import com.ecommerce.spring.ecommercespring.entity.Category;
import java.util.List;

public class CategoryMapper {

  public static CategoryDTO toDto(Category category) {
    return CategoryDTO.builder()
      .id(category.getId())
      .name(category.getName())
      .build();
  }

  public static Category toEntity(CategoryDTO dto) {
    return Category.builder().name(dto.getName()).build();
  }

  public static CategoryWithProductsDTO toCategoryWithProducts(
    Category category,
    List<ProductDTO> products
  ) {
    return CategoryWithProductsDTO.builder()
      .id(category.getId())
      .name(category.getName())
      .products(products)
      .build();
  }
}

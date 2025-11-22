package com.ecommerce.spring.ecommercespring.mappers;

import com.ecommerce.spring.ecommercespring.dto.ProductDTO;
import com.ecommerce.spring.ecommercespring.dto.ProductWithCategoryDTO;
import com.ecommerce.spring.ecommercespring.entity.Category;
import com.ecommerce.spring.ecommercespring.entity.Product;

public class ProductMapper {

  public static ProductDTO toDto(Product prod) {
    return ProductDTO.builder()
      .id((int) prod.getId())
      .title(prod.getTitle())
      .price(prod.getPrice())
      .categoryId(prod.getCategory().getId())
      .description(prod.getDescription())
      .image(prod.getImage())
      .build();
  }

  public static Product toEntity(ProductDTO dto, Category category) {
    return Product.builder()
      .title(dto.getTitle())
      .price(dto.getPrice())
      .category(category)
      .description(dto.getDescription())
      .image(dto.getImage())
      .build();
  }

  public static ProductWithCategoryDTO toProductWithCategory(Product product) {
    return ProductWithCategoryDTO.builder()
      .title(product.getTitle())
      .price(product.getPrice())
      .category(CategoryMapper.toDto(product.getCategory()))
      .description(product.getDescription())
      .image(product.getImage())
      .build();
  }
}

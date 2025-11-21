package com.ecommerce.spring.ecommercespring.mappers;

import com.ecommerce.spring.ecommercespring.dto.ProductDTO;
import com.ecommerce.spring.ecommercespring.entity.Product;

public class ProductMapper {

  public static ProductDTO toDto(Product prod) {
    return ProductDTO.builder()
      .id((int) prod.getId())
      .title(prod.getTitle())
      .price(prod.getPrice())
      .category(prod.getCategory())
      .description(prod.getDescription())
      .image(prod.getImage())
      .build();
  }

  public static Product toEntity(ProductDTO dto) {
    return Product.builder()
      .title(dto.getTitle())
      .price(dto.getPrice())
      .category(dto.getCategory())
      .description(dto.getDescription())
      .image(dto.getImage())
      .build();
  }
}

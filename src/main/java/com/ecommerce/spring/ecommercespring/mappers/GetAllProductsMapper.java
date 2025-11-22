package com.ecommerce.spring.ecommercespring.mappers;

import com.ecommerce.spring.ecommercespring.dto.FakeStoreProductResponseDTO;
import com.ecommerce.spring.ecommercespring.dto.ProductDTO;

public class GetAllProductsMapper {

  public static FakeStoreProductResponseDTO toFakeStoreProductDTO() {
    return null;
  }

  public static ProductDTO mapToProductDTO(
    FakeStoreProductResponseDTO product
  ) {
    return ProductDTO.builder()
      .id(product.getId())
      .title(product.getTitle())
      .price(product.getPrice())
      .description(product.getDescription())
      //.categoryId(product.getCategory())
      .image(product.getImage())
      .build();
  }
}

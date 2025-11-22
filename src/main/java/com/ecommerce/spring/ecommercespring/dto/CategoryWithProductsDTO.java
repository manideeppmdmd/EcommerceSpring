package com.ecommerce.spring.ecommercespring.dto;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CategoryWithProductsDTO {

  private Long id;
  private String name;
  private List<ProductDTO> products;
}

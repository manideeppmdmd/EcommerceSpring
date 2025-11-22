package com.ecommerce.spring.ecommercespring.dto;

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
public class ProductWithCategoryDTO {

  private Integer id;
  private String title;
  private double price;
  private String description;

  private String image;

  private CategoryDTO category;
}

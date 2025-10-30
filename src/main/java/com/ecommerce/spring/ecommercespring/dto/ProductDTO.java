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
public class ProductDTO {

  private Integer id;
  private String title;
  private double price;
  private String description;
  private String category;
  private String image;
}

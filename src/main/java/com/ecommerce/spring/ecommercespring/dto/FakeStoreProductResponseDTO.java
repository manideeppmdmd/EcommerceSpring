package com.ecommerce.spring.ecommercespring.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FakeStoreProductResponseDTO {

  private int id;
  private String title;
  private double price;
  private String description;
  private String category;
  private String image;
  private Rating rating;

  private class Rating {

    private double rate;
    private int count;
  }
}

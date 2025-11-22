package com.ecommerce.spring.ecommercespring.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Product extends BaseEntity {

  private long id;
  private String title;
  private double price;
  private String description;

  private String image;

  @ManyToOne
  @JoinColumn(name = "category_id", nullable = false)
  private Category category;
}

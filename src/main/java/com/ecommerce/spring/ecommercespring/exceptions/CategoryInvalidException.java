package com.ecommerce.spring.ecommercespring.exceptions;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@Builder
public class CategoryInvalidException extends RuntimeException {

  public CategoryInvalidException(String message) {
    super(message);
  }
}

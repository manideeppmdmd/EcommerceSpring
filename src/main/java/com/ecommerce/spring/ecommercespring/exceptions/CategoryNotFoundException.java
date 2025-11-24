package com.ecommerce.spring.ecommercespring.exceptions;

public class CategoryNotFoundException extends RuntimeException {

  public CategoryNotFoundException(String message) {
    super(message);
  }
}

package com.ecommerce.spring.ecommercespring.services;

import java.io.IOException;

import com.ecommerce.spring.ecommercespring.dto.ProductDTO;

public interface IProductService {
  ProductDTO getAllProducts() throws IOException;
}

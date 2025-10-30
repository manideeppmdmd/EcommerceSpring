package com.ecommerce.spring.ecommercespring.services;

import java.io.IOException;
import java.util.List;

import com.ecommerce.spring.ecommercespring.dto.ProductDTO;

public interface IProductService {
  List<ProductDTO> getAllProducts() throws IOException;

  ProductDTO getProduct(String id) throws IOException;
}

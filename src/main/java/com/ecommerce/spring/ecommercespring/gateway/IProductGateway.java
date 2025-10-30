package com.ecommerce.spring.ecommercespring.gateway;

import java.io.IOException;
import java.util.List;

import com.ecommerce.spring.ecommercespring.dto.ProductDTO;

public interface IProductGateway {
  List<ProductDTO> getAllProducts() throws IOException;

  ProductDTO getProduct(String id) throws IOException;
}

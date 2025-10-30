package com.ecommerce.spring.ecommercespring.gateway;

import java.io.IOException;

import com.ecommerce.spring.ecommercespring.dto.ProductDTO;

public interface IProductGateway {
  ProductDTO getAllProducts() throws IOException;
}

package com.ecommerce.spring.ecommercespring.gateway;

import com.ecommerce.spring.ecommercespring.dto.ProductDTO;
import java.io.IOException;
import java.util.List;

public interface IProductGateway {
  List<ProductDTO> getAllProducts() throws IOException;

  ProductDTO getProduct(Long id) throws IOException;
}

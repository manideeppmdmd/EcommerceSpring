package com.ecommerce.spring.ecommercespring.services;

import com.ecommerce.spring.ecommercespring.dto.ProductDTO;
import com.ecommerce.spring.ecommercespring.dto.ProductWithCategoryDTO;
import java.io.IOException;
import java.util.List;

public interface IProductService {
  List<ProductDTO> getAllProducts() throws IOException;

  ProductDTO getProduct(Long id) throws IOException;

  ProductDTO create(ProductDTO dto) throws IOException;

  ProductWithCategoryDTO getProductWithCategory(Long id) throws Exception;
}

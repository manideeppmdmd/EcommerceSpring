package com.ecommerce.spring.ecommercespring.services;

import com.ecommerce.spring.ecommercespring.dto.CategoryDTO;
import com.ecommerce.spring.ecommercespring.dto.CategoryWithProductsDTO;
import java.io.IOException;
import java.util.List;

public interface ICategoryService {
  List<CategoryDTO> getAllCategory();

  CategoryDTO createCategory(CategoryDTO category);

  CategoryDTO getByName(String name) throws IOException;

  CategoryWithProductsDTO getCategoryWithProducts(Long id) throws Exception;
}

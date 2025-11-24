package com.ecommerce.spring.ecommercespring.services;

import com.ecommerce.spring.ecommercespring.dto.CategoryDTO;
import com.ecommerce.spring.ecommercespring.dto.CategoryWithProductsDTO;
import java.util.List;

public interface ICategoryService {
  List<CategoryDTO> getAllCategory();

  CategoryDTO createCategory(CategoryDTO category);

  CategoryDTO getByName(String name);

  CategoryWithProductsDTO getCategoryWithProducts(Long id);
}

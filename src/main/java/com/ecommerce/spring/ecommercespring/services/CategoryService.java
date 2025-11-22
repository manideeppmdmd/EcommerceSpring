package com.ecommerce.spring.ecommercespring.services;

import com.ecommerce.spring.ecommercespring.dto.CategoryDTO;
import com.ecommerce.spring.ecommercespring.dto.CategoryWithProductsDTO;
import com.ecommerce.spring.ecommercespring.dto.ProductDTO;
import com.ecommerce.spring.ecommercespring.entity.Category;
import com.ecommerce.spring.ecommercespring.entity.Product;
import com.ecommerce.spring.ecommercespring.mappers.CategoryMapper;
import com.ecommerce.spring.ecommercespring.mappers.ProductMapper;
import com.ecommerce.spring.ecommercespring.repository.CategoryRepository;
import com.ecommerce.spring.ecommercespring.repository.ProductRepository;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class CategoryService implements ICategoryService {

  private final CategoryRepository repo;
  private final ProductRepository productRepo;

  public CategoryService(
    CategoryRepository _repo,
    ProductRepository _productRepo
  ) {
    this.repo = _repo;
    this.productRepo = _productRepo;
  }

  @Override
  public List<CategoryDTO> getAllCategory() {
    List<CategoryDTO> dtos = new ArrayList<>();
    for (Category category : this.repo.findAll()) {
      dtos.add(CategoryMapper.toDto(category));
    }
    return dtos;
  }

  @Override
  public CategoryDTO createCategory(CategoryDTO category) {
    Category savedCategory = this.repo.save(CategoryMapper.toEntity(category));
    return CategoryMapper.toDto(savedCategory);
  }

  @Override
  public CategoryDTO getByName(String name) throws IOException {
    return this.repo.findByName(name)
      .map(CategoryMapper::toDto)
      .orElseThrow(() -> new IOException("No category with give name"));
  }

  @Override
  public CategoryWithProductsDTO getCategoryWithProducts(Long id)
    throws Exception {
    Category category =
      this.repo.findById(id).orElseThrow(() ->
          new Exception("No category with Id: " + id)
        );

    List<ProductDTO> products =
      this.productRepo.findByCategoryId(id)
        .stream()
        .map(ProductMapper::toDto)
        .toList();

    if (products.isEmpty()) {
      throw new RuntimeException(
        "No products with category name: " + category.getName()
      );
    }

    return CategoryMapper.toCategoryWithProducts(category, products);
  }
}

package com.ecommerce.spring.ecommercespring.controllers;

import com.ecommerce.spring.ecommercespring.dto.CategoryDTO;
import com.ecommerce.spring.ecommercespring.dto.CategoryWithProductsDTO;
import com.ecommerce.spring.ecommercespring.services.ICategoryService;
import java.io.IOException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {

  private final ICategoryService categoryService;

  public CategoryController(ICategoryService _categoryService) {
    this.categoryService = _categoryService;
  }

  @GetMapping
  public ResponseEntity<?> getAllCategories(
    @RequestParam(required = false) String name
  ) throws IOException {
    if (name != null && !name.isBlank()) {
      CategoryDTO categoryDTO = categoryService.getByName(name);
      return ResponseEntity.ok(categoryDTO);
    } else {
      return ResponseEntity.ok(this.categoryService.getAllCategory());
    }
  }

  @PostMapping
  public ResponseEntity<CategoryDTO> createCategory(
    @RequestBody CategoryDTO dto
  ) {
    return ResponseEntity.ok(this.categoryService.createCategory(dto));
  }

  @GetMapping("/{id}/products")
  public ResponseEntity<CategoryWithProductsDTO> getCategoryWithProducts(
    @PathVariable Long id
  ) throws Exception {
    System.out.println("This method was called");
    return ResponseEntity.ok(categoryService.getCategoryWithProducts(id));
  }
}

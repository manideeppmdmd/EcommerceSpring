package com.ecommerce.spring.ecommercespring.controllers;

import com.ecommerce.spring.ecommercespring.dto.ProductDTO;
import com.ecommerce.spring.ecommercespring.dto.ProductWithCategoryDTO;
import com.ecommerce.spring.ecommercespring.services.IProductService;
import java.io.IOException;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/products")
public class ProductController {

  private final IProductService productService;

  public ProductController(
    @Qualifier("productService") IProductService _productService
  ) {
    this.productService = _productService;
  }

  // @GetMapping
  // public List<ProductDTO> getProducts() throws IOException {
  //   return productService.getAllProducts();
  // }

  @GetMapping("/{id}")
  public ProductDTO getProduct(@PathVariable("id") Long id) throws IOException {
    return productService.getProduct(id);
  }

  @PostMapping("")
  public ResponseEntity<ProductDTO> createProduct(@RequestBody ProductDTO dto)
    throws IOException {
    return ResponseEntity.ok(productService.create(dto));
  }

  @GetMapping("/{id}/details")
  public ResponseEntity<ProductWithCategoryDTO> getProductWithCategory(
    @PathVariable Long id
  ) throws Exception {
    return ResponseEntity.ok(productService.getProductWithCategory(id));
  }
}

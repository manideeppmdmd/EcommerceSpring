package com.ecommerce.spring.ecommercespring.controllers;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.spring.ecommercespring.dto.ProductDTO;
import com.ecommerce.spring.ecommercespring.services.IProductService;

@RestController
@RequestMapping("/api/products")
public class ProductController {

  @Autowired
  private IProductService productService;

  @GetMapping
  public List<ProductDTO> getProducts() throws IOException {
    return productService.getAllProducts();
  }

  @GetMapping("/{id}")
  public ProductDTO getProduct(@PathVariable("id") String id)
    throws IOException {
    return productService.getProduct(id);
  }
}

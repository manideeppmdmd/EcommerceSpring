package com.ecommerce.spring.ecommercespring.controllers;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
  public ProductDTO getProducts() throws IOException {
    return productService.getAllProducts();
  }
}

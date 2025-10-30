package com.ecommerce.spring.ecommercespring.services;

import java.io.IOException;

import org.springframework.stereotype.Service;

import com.ecommerce.spring.ecommercespring.dto.ProductDTO;
import com.ecommerce.spring.ecommercespring.gateway.IProductGateway;

@Service
public class FakeStoreProductService implements IProductService {

  private final IProductGateway productGateway;

  public FakeStoreProductService(IProductGateway _productGateway) {
    this.productGateway = _productGateway;
  }

  @Override
  public ProductDTO getAllProducts() throws IOException {
    return this.productGateway.getAllProducts();
  }
}

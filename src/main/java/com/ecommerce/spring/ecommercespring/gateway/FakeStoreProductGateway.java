package com.ecommerce.spring.ecommercespring.gateway;

import java.io.IOException;

import org.springframework.stereotype.Component;

import com.ecommerce.spring.ecommercespring.dto.FakeStoreProductResponseDTO;
import com.ecommerce.spring.ecommercespring.dto.ProductDTO;
import com.ecommerce.spring.ecommercespring.gateway.api.FakeStoreProductAPI;

@Component
public class FakeStoreProductGateway implements IProductGateway {

  private final FakeStoreProductAPI fakeStoreProductAPI;

  public FakeStoreProductGateway(FakeStoreProductAPI _fakeStoreProductAPI) {
    this.fakeStoreProductAPI = _fakeStoreProductAPI;
  }

  @Override
  public ProductDTO getAllProducts() throws IOException {
    FakeStoreProductResponseDTO response =
      this.fakeStoreProductAPI.getAllFakeProducts().execute().body();
    ProductDTO prod = ProductDTO.builder()
      .id(response.getId())
      .title(response.getTitle())
      .price(response.getPrice())
      .description(response.getDescription())
      .category(response.getCategory())
      .image(response.getImage())
      .build();
    return prod;
  }
}

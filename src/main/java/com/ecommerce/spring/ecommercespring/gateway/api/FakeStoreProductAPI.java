package com.ecommerce.spring.ecommercespring.gateway.api;

import org.springframework.stereotype.Component;

import com.ecommerce.spring.ecommercespring.dto.FakeStoreProductResponseDTO;

import retrofit2.Call;
import retrofit2.http.GET;

@Component
public interface FakeStoreProductAPI {
  @GET("/products/1")
  Call<FakeStoreProductResponseDTO> getAllFakeProducts();
}

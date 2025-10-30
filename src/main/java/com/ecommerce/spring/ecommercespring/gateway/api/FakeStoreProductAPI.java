package com.ecommerce.spring.ecommercespring.gateway.api;

import java.util.List;

import org.springframework.stereotype.Component;

import com.ecommerce.spring.ecommercespring.dto.FakeStoreProductResponseDTO;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

@Component
public interface FakeStoreProductAPI {
  @GET("/products")
  Call<List<FakeStoreProductResponseDTO>> getAllFakeProducts();

  @GET("/products/{id}")
  Call<FakeStoreProductResponseDTO> getFakeProduct(@Path("id") String id);
}

package com.ecommerce.spring.ecommercespring.gateway;

import com.ecommerce.spring.ecommercespring.dto.FakeStoreProductResponseDTO;
import com.ecommerce.spring.ecommercespring.dto.ProductDTO;
import com.ecommerce.spring.ecommercespring.gateway.api.FakeStoreProductAPI;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Component;

@Component
public class FakeStoreProductGateway implements IProductGateway {

  private final FakeStoreProductAPI fakeStoreProductAPI;

  public FakeStoreProductGateway(FakeStoreProductAPI _fakeStoreProductAPI) {
    this.fakeStoreProductAPI = _fakeStoreProductAPI;
  }

  @Override
  public List<ProductDTO> getAllProducts() throws IOException {
    List<FakeStoreProductResponseDTO> response =
      this.fakeStoreProductAPI.getAllFakeProducts().execute().body();

    if (response == null) {
      return Collections.emptyList(); // handle null safely
    }

    List<ProductDTO> products = response
      .stream()
      .map(product ->
        ProductDTO.builder()
          .id(product.getId())
          .title(product.getTitle())
          .price(product.getPrice())
          .description(product.getDescription())
          .category(product.getCategory())
          .image(product.getImage())
          .build()
      )
      .collect(Collectors.toList());

    return products;
  }

  @Override
  public ProductDTO getProduct(String id) throws IOException {
    FakeStoreProductResponseDTO response =
      this.fakeStoreProductAPI.getFakeProduct(id).execute().body();

    ProductDTO product = ProductDTO.builder()
      .id(response.getId())
      .title(response.getTitle())
      .price(response.getPrice())
      .description(response.getDescription())
      .category(response.getCategory())
      .image(response.getImage())
      .build();

    return product;
  }
}

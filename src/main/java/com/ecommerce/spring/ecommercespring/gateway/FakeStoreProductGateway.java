package com.ecommerce.spring.ecommercespring.gateway;

import com.ecommerce.spring.ecommercespring.dto.FakeStoreProductResponseDTO;
import com.ecommerce.spring.ecommercespring.dto.ProductDTO;
import com.ecommerce.spring.ecommercespring.gateway.api.FakeStoreProductAPI;
import com.ecommerce.spring.ecommercespring.mappers.GetAllProductsMapper;
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
      .map(GetAllProductsMapper::mapToProductDTO)
      .collect(Collectors.toList());

    return products;
  }

  @Override
  public ProductDTO getProduct(Long id) throws IOException {
    FakeStoreProductResponseDTO response =
      this.fakeStoreProductAPI.getFakeProduct(id).execute().body();

    ProductDTO product = GetAllProductsMapper.mapToProductDTO(response);

    return product;
  }
}

package com.ecommerce.spring.ecommercespring.services;

import com.ecommerce.spring.ecommercespring.dto.ProductDTO;
import com.ecommerce.spring.ecommercespring.dto.ProductWithCategoryDTO;
import com.ecommerce.spring.ecommercespring.gateway.IProductGateway;
import java.io.IOException;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class FakeStoreProductService implements IProductService {

  private final IProductGateway productGateway;

  public FakeStoreProductService(IProductGateway _productGateway) {
    this.productGateway = _productGateway;
  }

  @Override
  public List<ProductDTO> getAllProducts() throws IOException {
    return this.productGateway.getAllProducts();
  }

  @Override
  public ProductDTO getProduct(Long id) throws IOException {
    return this.productGateway.getProduct(id);
  }

  @Override
  public ProductDTO create(ProductDTO dto) throws IOException {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'create'");
  }

  @Override
  public ProductWithCategoryDTO getProductWithCategory(Long id) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException(
      "Unimplemented method 'getProductWithCategory'"
    );
  }
}

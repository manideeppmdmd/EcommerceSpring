package com.ecommerce.spring.ecommercespring.services;

import com.ecommerce.spring.ecommercespring.dto.ProductDTO;
import com.ecommerce.spring.ecommercespring.entity.Product;
import com.ecommerce.spring.ecommercespring.mappers.ProductMapper;
import com.ecommerce.spring.ecommercespring.repository.ProductRepository;
import java.io.IOException;
import java.util.List;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component("productService")
@Service
public class ProductService implements IProductService {

  private final ProductRepository repo;

  public ProductService(ProductRepository _repo) {
    this.repo = _repo;
  }

  @Override
  public List<ProductDTO> getAllProducts() throws IOException {
    // return repo
    //   .findAll()
    //   .map(ProductMapper::toDto)
    //   .orElseThrow(() -> new IOException("No Products"));

    return null;
  }

  @Override
  public ProductDTO getProduct(Long id) throws IOException {
    // return repo
    //   .findById(id)
    //   .map(ProductMapper::toDto)
    //   .orElseThrow(() -> new IOException("Product not found"));

    Product product = repo
      .findById(id)
      .orElseThrow(() -> new IOException("Product not found"));

    return ProductMapper.toDto(product);
  }

  @Override
  public ProductDTO create(ProductDTO dto) throws IOException {
    Product saved = repo.save(ProductMapper.toEntity(dto));

    return ProductMapper.toDto(saved);
  }
}

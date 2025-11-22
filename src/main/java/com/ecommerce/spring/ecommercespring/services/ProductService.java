package com.ecommerce.spring.ecommercespring.services;

import com.ecommerce.spring.ecommercespring.dto.ProductDTO;
import com.ecommerce.spring.ecommercespring.dto.ProductWithCategoryDTO;
import com.ecommerce.spring.ecommercespring.entity.Category;
import com.ecommerce.spring.ecommercespring.entity.Product;
import com.ecommerce.spring.ecommercespring.mappers.ProductMapper;
import com.ecommerce.spring.ecommercespring.repository.CategoryRepository;
import com.ecommerce.spring.ecommercespring.repository.ProductRepository;
import java.io.IOException;
import java.util.List;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component("productService")
@Service
public class ProductService implements IProductService {

  private final ProductRepository repo;
  private final CategoryRepository cateRepo;

  public ProductService(ProductRepository _repo, CategoryRepository _cateRepo) {
    this.repo = _repo;
    this.cateRepo = _cateRepo;
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
    Category category =
      this.cateRepo.findById(dto.getCategoryId()).orElseThrow(() ->
          new IOException("Category ID is invalid")
        );
    Product saved = repo.save(ProductMapper.toEntity(dto, category));

    return ProductMapper.toDto(saved);
  }

  @Override
  public ProductWithCategoryDTO getProductWithCategory(Long id)
    throws Exception {
    Product product =
      this.repo.findById(id).orElseThrow(() ->
          new Exception("No product with Id: " + id)
        );

    return ProductMapper.toProductWithCategory(product);
  }
}

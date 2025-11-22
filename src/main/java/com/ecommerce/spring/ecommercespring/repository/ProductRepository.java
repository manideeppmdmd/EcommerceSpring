package com.ecommerce.spring.ecommercespring.repository;

import com.ecommerce.spring.ecommercespring.entity.Product;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
  @Query("SELECT p from Product p WHERE p.price > :minPrice")
  List<Product> findExpensiveProducts(@Param("minPrice") double minPrice);

  @Query(
    value = "Select * FROM product WHERE (title,description) AGAINST (:keyword)",
    nativeQuery = true
  )
  List<Product> searchFullText(@Param("keyword") String keyword);

  List<Product> findByCategoryId(Long categoryId);
}

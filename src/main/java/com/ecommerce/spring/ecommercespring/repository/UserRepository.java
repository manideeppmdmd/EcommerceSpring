package com.ecommerce.spring.ecommercespring.repository;

import com.ecommerce.spring.ecommercespring.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {}

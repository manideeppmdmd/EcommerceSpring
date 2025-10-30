package com.ecommerce.spring.ecommercespring.services;

import java.util.List;

import com.ecommerce.spring.ecommercespring.dto.UserDTO;

public interface IUserService {
  List<UserDTO> getAllUsers();
}

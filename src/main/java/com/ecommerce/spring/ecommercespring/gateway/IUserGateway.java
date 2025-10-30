package com.ecommerce.spring.ecommercespring.gateway;

import java.util.List;

import com.ecommerce.spring.ecommercespring.dto.UserDTO;

public interface IUserGateway {
  List<UserDTO> getAllUsers();
}

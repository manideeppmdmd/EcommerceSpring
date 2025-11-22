package com.ecommerce.spring.ecommercespring.services;

import com.ecommerce.spring.ecommercespring.dto.UserDTO;
import java.io.IOException;
import java.util.List;

public interface IUserService {
  List<UserDTO> getAllUsers();

  UserDTO getUser(Long id) throws IOException;

  UserDTO create(UserDTO dto) throws IOException;
}

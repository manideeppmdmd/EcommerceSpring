package com.ecommerce.spring.ecommercespring.mappers;

import com.ecommerce.spring.ecommercespring.dto.UserDTO;
import com.ecommerce.spring.ecommercespring.entity.User;

public class UserMapper {

  public static UserDTO toDto(User user) {
    return UserDTO.builder()
      .id((int) user.getId())
      .username(user.getUsername())
      .email(user.getEmail())
      .password(user.getPassword())
      .build();
  }

  public static User toEntity(UserDTO dto) {
    return User.builder()
      .username(dto.getUsername())
      .email(dto.getEmail())
      .password(dto.getPassword())
      .build();
  }
}

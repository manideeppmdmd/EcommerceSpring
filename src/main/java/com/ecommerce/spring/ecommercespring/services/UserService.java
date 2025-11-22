package com.ecommerce.spring.ecommercespring.services;

import com.ecommerce.spring.ecommercespring.dto.UserDTO;
import com.ecommerce.spring.ecommercespring.entity.User;
import com.ecommerce.spring.ecommercespring.mappers.UserMapper;
import com.ecommerce.spring.ecommercespring.repository.UserRepository;
import java.io.IOException;
import java.util.List;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserService implements IUserService {

  private final UserRepository repo;

  public UserService(UserRepository _repo) {
    this.repo = _repo;
  }

  @Override
  public List<UserDTO> getAllUsers() {
    throw new UnsupportedOperationException(
      "Unimplemented method 'getAllUsers'"
    );
  }

  @Override
  public UserDTO getUser(Long id) throws IOException {
    User user =
      this.repo.findById(id).orElseThrow(() ->
          new IOException("No User with given ID")
        );
    return UserMapper.toDto(user);
  }

  @Override
  public UserDTO create(UserDTO dto) throws IOException {
    User user = this.repo.save(UserMapper.toEntity(dto));

    return UserMapper.toDto(user);
  }
}

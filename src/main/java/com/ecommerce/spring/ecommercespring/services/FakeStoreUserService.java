package com.ecommerce.spring.ecommercespring.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ecommerce.spring.ecommercespring.dto.UserDTO;
import com.ecommerce.spring.ecommercespring.gateway.IUserGateway;

@Service
public class FakeStoreUserService implements IUserService {

  private final IUserGateway userGateway;

  public FakeStoreUserService(IUserGateway _userGateway) {
    this.userGateway = _userGateway;
  }

  @Override
  public List<UserDTO> getAllUsers() {
    return userGateway.getAllUsers();
  }
}

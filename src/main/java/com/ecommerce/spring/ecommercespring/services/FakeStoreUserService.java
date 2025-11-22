package com.ecommerce.spring.ecommercespring.services;

import com.ecommerce.spring.ecommercespring.dto.UserDTO;
import com.ecommerce.spring.ecommercespring.gateway.IUserGateway;
import java.util.List;
import org.springframework.stereotype.Service;

@Service("fakeStoreUserService")
public class FakeStoreUserService implements IUserService {

  private final IUserGateway userGateway;

  public FakeStoreUserService(IUserGateway _userGateway) {
    this.userGateway = _userGateway;
  }

  @Override
  public List<UserDTO> getAllUsers() {
    return userGateway.getAllUsers();
  }

  @Override
  public UserDTO getUser(Long id) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getUser'");
  }

  @Override
  public UserDTO create(UserDTO dto) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'create'");
  }
}

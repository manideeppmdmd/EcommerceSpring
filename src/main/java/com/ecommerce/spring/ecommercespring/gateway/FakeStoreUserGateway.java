package com.ecommerce.spring.ecommercespring.gateway;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.ecommerce.spring.ecommercespring.dto.FakeStoreUserResponseDTO;
import com.ecommerce.spring.ecommercespring.dto.UserDTO;
import com.ecommerce.spring.ecommercespring.gateway.api.FakeStoreUserAPI;

@Component
public class FakeStoreUserGateway implements IUserGateway {

  private final FakeStoreUserAPI fakeStoreUserAPI;

  public FakeStoreUserGateway(FakeStoreUserAPI _fakeStoreUserAPI) {
    this.fakeStoreUserAPI = _fakeStoreUserAPI;
  }

  @Override
  public List<UserDTO> getAllUsers() {
    List<FakeStoreUserResponseDTO> users = fakeStoreUserAPI.getAllUsers();

    if (users == null) {
      return null;
    }

    List<UserDTO> userList = users
      .stream()
      .map(user ->
        UserDTO.builder()
          .id(user.getId())
          .username(user.getUsername())
          .email(user.getEmail())
          .password(user.getPassword())
          .build()
      )
      .collect(Collectors.toList());

    return userList;
  }
}

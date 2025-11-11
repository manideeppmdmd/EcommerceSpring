package com.ecommerce.spring.ecommercespring.controllers;

import com.ecommerce.spring.ecommercespring.dto.UserDTO;
import com.ecommerce.spring.ecommercespring.services.IUserService;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserController {

  private final IUserService userService;

  public UserController(IUserService _userService) {
    this.userService = _userService;
  }

  @GetMapping
  public ResponseEntity<List<UserDTO>> getAllUsers() {
    List<UserDTO> result = this.userService.getAllUsers();

    return ResponseEntity.ok(result);
  }
}

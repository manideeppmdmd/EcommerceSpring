package com.ecommerce.spring.ecommercespring.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.spring.ecommercespring.dto.UserDTO;
import com.ecommerce.spring.ecommercespring.services.IUserService;

@RestController
@RequestMapping("/api/users")
public class UserController {

  private final IUserService userService;

  public UserController(IUserService _userService) {
    this.userService = _userService;
  }

  @GetMapping
  public List<UserDTO> getAllUsers() {
    return this.userService.getAllUsers();
  }
}

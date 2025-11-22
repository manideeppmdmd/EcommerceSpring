package com.ecommerce.spring.ecommercespring.controllers;

import com.ecommerce.spring.ecommercespring.dto.UserDTO;
import com.ecommerce.spring.ecommercespring.services.IUserService;
import java.io.IOException;
import java.util.List;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserController {

  private final IUserService userService;

  public UserController(@Qualifier("userService") IUserService _userService) {
    this.userService = _userService;
  }

  @GetMapping
  public ResponseEntity<List<UserDTO>> getAllUsers() {
    List<UserDTO> result = this.userService.getAllUsers();

    return ResponseEntity.ok(result);
  }

  @GetMapping("/{id}")
  public ResponseEntity<UserDTO> getUserById(@PathVariable Long id)
    throws IOException {
    return ResponseEntity.ok(this.userService.getUser(id));
  }

  @PostMapping("")
  public ResponseEntity<UserDTO> postMethodName(@RequestBody UserDTO dto)
    throws IOException {
    return ResponseEntity.ok(this.userService.create(dto));
  }
}

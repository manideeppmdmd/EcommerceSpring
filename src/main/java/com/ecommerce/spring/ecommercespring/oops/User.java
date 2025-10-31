package com.ecommerce.spring.ecommercespring.oops;

public class User {

  private String username;
  private String email;

  public User(String username, String email) {
    this.username = username;
    this.email = email;
  }

  public void login() {
    System.out.println("User is logged in!");
  }

  public void showLandingPage() {
    System.out.println(username + " LandingPage");
  }
}

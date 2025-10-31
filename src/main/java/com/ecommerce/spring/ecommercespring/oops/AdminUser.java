package com.ecommerce.spring.ecommercespring.oops;

public class AdminUser extends User {

  public AdminUser(String username, String email) {
    super(username, email);
  }

  public void manageProducts() {
    System.out.println("Manage Products");
  }

  @Override
  public void showLandingPage() {
    //super.showLandingPage();
    System.out.println("Admin Landing Page");
  }
}

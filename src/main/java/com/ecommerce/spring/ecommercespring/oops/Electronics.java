package com.ecommerce.spring.ecommercespring.oops;

public class Electronics extends Product {

  public Electronics(String name, double price) {
    super(name, price);
  }

  @Override
  double calculateDiscount() {
    return price * 0.05;
  }

  @Override
  double calculateTax() {
    return price * 0.08;
  }

  @Override
  double calculateShippingCost() {
    return price * 0.01;
  }

  public static void main(String[] args) {
    Product electronics = new Electronics("SmartPhone", 5000);
  }
}

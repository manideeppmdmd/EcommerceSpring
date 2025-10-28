package com.ecommerce.spring.ecommercespring;

import io.github.cdimascio.dotenv.Dotenv;
import io.github.cdimascio.dotenv.DotenvEntry;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EcommercespringApplication {

  public static void main(String[] args) {
    Dotenv dotenv = Dotenv.configure().load();

    dotenv
      .entries()
      .forEach((DotenvEntry entry) ->
        System.setProperty(entry.getKey(), entry.getValue())
      );

    SpringApplication.run(EcommercespringApplication.class, args);
  }
}

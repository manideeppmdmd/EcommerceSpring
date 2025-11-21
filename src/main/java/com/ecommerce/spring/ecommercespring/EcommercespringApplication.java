package com.ecommerce.spring.ecommercespring;

import io.github.cdimascio.dotenv.Dotenv;
import io.github.cdimascio.dotenv.DotenvEntry;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class EcommercespringApplication {

  public static void main(String[] args) {
    Dotenv dotenv = Dotenv.configure().load(); // load the env variables

    dotenv
      .entries()
      .forEach((DotenvEntry entry) ->
        System.setProperty(entry.getKey(), entry.getValue())
      ); // Set the env variables

    SpringApplication.run(EcommercespringApplication.class, args);
  }
}

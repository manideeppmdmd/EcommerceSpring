package com.ecommerce.spring.ecommercespring.gateway.api;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.ecommerce.spring.ecommercespring.dto.FakeStoreUserResponseDTO;
import com.fasterxml.jackson.databind.ObjectMapper;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

@Component
public class FakeStoreUserAPI {

  @Value("${FAKE_STORE_API_URL}")
  private String url;

  public List<FakeStoreUserResponseDTO> getAllUsers() {
    OkHttpClient client = new OkHttpClient();

    Request request = new Request.Builder().url(url + "/users").build();

    try (Response response = client.newCall(request).execute()) {
      if (!response.isSuccessful()) {
        throw new IOException("Something went wrong");
      }
      ObjectMapper mapper = new ObjectMapper();
      return Arrays.asList(
        mapper.readValue(
          response.body().string(),
          FakeStoreUserResponseDTO[].class
        )
      );
    } catch (Exception e) {
      e.printStackTrace();
      return null;
    }
  }
}

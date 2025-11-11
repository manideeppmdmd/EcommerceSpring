package com.ecommerce.spring.ecommercespring.gateway.api;

import com.ecommerce.spring.ecommercespring.dto.FakeStoreUserResponseDTO;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class FakeStoreUserAPI {

  @Value("${FAKE_STORE_API_URL}")
  private String url;

  RestTemplate restTemplate;

  public FakeStoreUserAPI(RestTemplate _restTemplate) {
    this.restTemplate = _restTemplate;
  }

  public List<FakeStoreUserResponseDTO> getAllUsers() {
    // OkHttpClient client = new OkHttpClient();

    // Request request = new Request.Builder().url(url + "/users").build();

    // try (Response response = client.newCall(request).execute()) {
    //   if (!response.isSuccessful()) {
    //     throw new IOException("Something went wrong");
    //   }
    //   ObjectMapper mapper = new ObjectMapper();
    //   return Arrays.asList(
    //     mapper.readValue(
    //       response.body().string(),
    //       FakeStoreUserResponseDTO[].class
    //     )
    //   );
    // } catch (Exception e) {
    //   e.printStackTrace();
    //   return null;
    // }

    List<FakeStoreUserResponseDTO> responseArray = Arrays.asList(
      this.restTemplate.getForObject(
          url + "/users",
          FakeStoreUserResponseDTO[].class
        )
    );

    return responseArray;
  }
}

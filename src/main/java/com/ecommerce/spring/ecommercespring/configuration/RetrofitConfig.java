package com.ecommerce.spring.ecommercespring.configuration;

import com.ecommerce.spring.ecommercespring.gateway.api.FakeStoreProductAPI;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Configuration
public class RetrofitConfig {

  @Value("${FAKE_STORE_API_URL}")
  private String url;

  @Bean
  public Retrofit retrofit() {
    return new Retrofit.Builder()
      .baseUrl(url)
      .addConverterFactory(GsonConverterFactory.create())
      .build();
  }

  @Bean
  public FakeStoreProductAPI fakeStoreProductAPI(Retrofit retrofit) {
    return retrofit.create(FakeStoreProductAPI.class);
  }
}

package com.imeal.imeal_back.helper.faker;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.github.javafaker.Faker;

@Configuration
public class FakerConfig {
  @Bean
  public Faker faker() {
    return new Faker();
  }
}

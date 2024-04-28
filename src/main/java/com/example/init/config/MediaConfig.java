package com.example.init.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
@Component//on utilise annotation componte car cette classe et ne pas classe 
@Order(1)
public class MediaConfig implements CommandLineRunner {
  @Override
  public void run(String... args) throws Exception {
      System.out.println("Media  initialized successfully!");
  }
    
}

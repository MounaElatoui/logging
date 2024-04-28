package com.example.init.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class MediaConfig implements CommandLineRunner {

  @Override
  public void run(String... args) throws Exception {
      System.out.println("Media  initialized successfully!");
  }
    
}

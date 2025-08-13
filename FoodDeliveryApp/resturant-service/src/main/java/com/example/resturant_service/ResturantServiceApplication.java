package com.example.resturant_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableDiscoveryClient

@SpringBootApplication(scanBasePackages = "com.example.resturant_service")


//@SpringBootApplication
public class ResturantServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ResturantServiceApplication.class, args);
	}

}

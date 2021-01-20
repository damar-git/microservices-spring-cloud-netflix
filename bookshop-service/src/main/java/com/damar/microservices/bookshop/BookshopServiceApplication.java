package com.damar.microservices.bookshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class BookshopServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookshopServiceApplication.class, args);
	}

}

package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootFirstApplication {

	public static void main(String[] args) {
		System.out.println("hello");
		SpringApplication.run(SpringBootFirstApplication.class, args);
	}

}

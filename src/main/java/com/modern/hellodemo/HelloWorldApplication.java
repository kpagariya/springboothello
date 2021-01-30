package com.modern.hellodemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloWorldApplication {

	// Main function thats gets triggered first.
	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApplication.class, args);
	}
}

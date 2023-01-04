package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringAzureTest1Application {

	@GetMapping("/get")
	public String getData() {
		return "hello";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringAzureTest1Application.class, args);
	}

}

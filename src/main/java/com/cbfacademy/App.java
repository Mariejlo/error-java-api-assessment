package com.cbfacademy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

	@GetMapping("/greeting")
	public String greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello %s", name);
	}

}
//Main method to start Spring Boot application
//Controller: Classes handling HTTP requests (e.g., REST controllers)
//Model: Classes representing entities or data models (e.g., User, FoodItem).
//Service: Classes containing business logic.
//Repository: Classes for database interactions.
//Config: Classes for configuration settings.
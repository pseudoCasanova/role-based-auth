package com.casanova.rolebasedauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class RoleBasedAuthApplication {

	public static void main(String[] args) {
		SpringApplication.run(RoleBasedAuthApplication.class, args);
	}

	@GetMapping("/hello")
	public String test() {
		return "Hello World!";
	}

}

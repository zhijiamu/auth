package org.test.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class AuthApplication {
	@RequestMapping("/")
	String home() {
		return "Hello World!";
	}

	@RequestMapping("/login")
	String login() {
		return "please login, Hello World!";
	}

	public static void main(String[] args) {
		SpringApplication.run(AuthApplication.class, args);
	}

}

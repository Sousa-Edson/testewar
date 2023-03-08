package com.teste.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class TestewarApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestewarApplication.class, args);
	}

	@GetMapping("/")
	public String index() {
		return "FUNCIONA AQUI";
		
	}

}

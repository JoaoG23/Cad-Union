package com.api.cadunion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CadUnionApplication {

	public static void main(String[] args) {
		SpringApplication.run(CadUnionApplication.class, args);

	}

	@GetMapping("/")
	public String index(){
		return "Testando Aplicacao";
	}

}

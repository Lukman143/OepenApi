package com.sk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Code Api", version = "2.0", description = "Code-Generate Application"))
public class CrudOperationCodeGenerateApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudOperationCodeGenerateApplication.class, args);
	}

}

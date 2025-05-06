package com.acounts;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
@OpenAPIDefinition(info = @Info(title = "Accounts Microservice API Documentation", 
								description = "Learning from EazyBank", 
								version = "v1", 
								contact = @Contact(
										name = "Sarathkumar",
										email = "s14321k@gmail.com",
										url = "silvershinesarath"
										),
								license = @License(
										name = "Apache 2.0",
										url = "silvershinesarath"
										)
								),
					externalDocs = @ExternalDocumentation(
							description = "Learning from EazyBank",
							url = "silvershinesarath"
							)
					)
public class AcountsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AcountsApplication.class, args);
	}

}

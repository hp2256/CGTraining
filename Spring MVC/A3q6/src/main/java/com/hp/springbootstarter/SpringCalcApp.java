package com.hp.springbootstarter;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@SpringBootApplication
public class SpringCalcApp {

	public static void main(String[] args) {
		SpringApplication.run(SpringCalcApp.class, args);
	}

	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

	@Bean
	public Docket swaggerConfiguration() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				// .paths(PathSelectors.ant("/api/*"))
				.apis(RequestHandlerSelectors.basePackage("com.hp")).build().apiInfo(apiDetails());
	}

	private ApiInfo apiDetails() {
		return new ApiInfo("assignments api", "assignments for training", "1.0", "Free to use",
				new springfox.documentation.service.Contact("Harsh", "12345", "abc@gmail"), "API LICENSE", "google.com",
				Collections.emptyList());
	}
}

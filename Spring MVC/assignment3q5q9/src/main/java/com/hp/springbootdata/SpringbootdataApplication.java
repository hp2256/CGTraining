package com.hp.springbootdata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class SpringbootdataApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootdataApplication.class, args);
	}

	/*
	 * @Bean public Docket swaggerConfiguration() { return new
	 * Docket(DocumentationType.SWAGGER_2).select() //
	 * .paths(PathSelectors.ant("/api/*" ))
	 * .apis(RequestHandlerSelectors.basePackage("com.hp")).build(); }
	 */

}

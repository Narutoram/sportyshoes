package com.sportyshoes.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication()
//@EnableSwagger2
public class ApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
	}
	
//	@Bean
//	public Docket swaggerConfiguration() {
//		return new Docket(DocumentationType.SWAGGER_2).select()
//				.apis(RequestHandlerSelectors.basePackage("com.sportyshoes.api.controller"))
//				.build()
//				.apiInfo(apiDetails());
//	}
//	private ApiInfo apiDetails() {
//		return new ApiInfoBuilder().title("Sping Boot Sportyshoes project")
//				.description("Spring Boot sportyshoes app with Swagger").version("1.0").termsOfServiceUrl("No terms")
//				.license("No license")
//				.contact(new Contact("Naruto", "https://github.com/Narutoram", "abc@example.com")).build();
//	}
	

}

package com.trip.mukja.config;

import static springfox.documentation.builders.PathSelectors.regex;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

<<<<<<< HEAD
//	Swagger-UI 2.x 확인
//	http://localhost:8080/{your-app-root}/swagger-ui.html
//	Swagger-UI 3.x 확인
//	http://localhost:8080/{your-app-root}/swagger-ui/index.html
	
	
	// Swagger 주소
	// http://localhost/swagger-ui/index.html
	
	private String version = "V1";
	private String title = "Mukja API " + version;
	
	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2).consumes(getConsumeContentTypes()).produces(getProduceContentTypes())
					.apiInfo(apiInfo()).groupName(version).select()
					.apis(RequestHandlerSelectors.basePackage("com.trip.mukja.controller"))
//					.paths(regex("/notices/*")).build()
//					.paths(regex("/notices/.*")).build() //requestMapping 적어주기
					.paths(PathSelectors.any()).build()
					.useDefaultResponseMessages(false);
	}
	
	private Set<String> getConsumeContentTypes() {
=======
//    Swagger-UI 2.x 확인
//    http://localhost:8080/{your-app-root}/swagger-ui.html
//    Swagger-UI 3.x 확인
//    http://localhost:8080/{your-app-root}/swagger-ui/index.html
    
    private String version = "V1";
    private String title = "SSAFY Board API " + version;
    
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2).consumes(getConsumeContentTypes()).produces(getProduceContentTypes())
                    .apiInfo(apiInfo()).groupName(version).select()
                    .apis(RequestHandlerSelectors.basePackage("com.trip.mukja.controller"))
//                    .paths(regex("/notices/.*")).build()
    				.paths(PathSelectors.any()) // controller에서 swagger를 지정할 대상 path 설정
                    .build() //requestMapping 적어주기
                    .useDefaultResponseMessages(false);
    }
    
    private Set<String> getConsumeContentTypes() {
>>>>>>> origin/dev
        Set<String> consumes = new HashSet<>();
        consumes.add("application/json;charset=UTF-8");
//      consumes.add("application/xml;charset=UTF-8");
        consumes.add("application/x-www-form-urlencoded");
        return consumes;
    }

    private Set<String> getProduceContentTypes() {
        Set<String> produces = new HashSet<>();
        produces.add("application/json;charset=UTF-8");
        return produces;
    }

<<<<<<< HEAD
	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title(title)
				.description("<h3>Mukja API Reference for Developers</h3>Swagger를 이용한 Mukja API<br><img src=\"/assets/img/ssafy_logo.png\" width=\"150\">") 
				.contact(new Contact("SSAFY", "https://edu.ssafy.com", "ssafy@ssafy.com"))
				.license("SSAFY License")
				.licenseUrl("https://www.ssafy.com/ksp/jsp/swp/etc/swpPrivacy.jsp")
				.version("1.0").build();
	}

}
=======
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder().title(title)
                .description("<h3>SSAFY API Reference for Developers</h3>Swagger를 이용한 Board API<br><img src=\"/assets/img/ssafy_logo.png\" width=\"150\">") 
                .contact(new Contact("SSAFY", "https://edu.ssafy.com", "ssafy@ssafy.com"))
                .license("SSAFY License")
                .licenseUrl("https://www.ssafy.com/ksp/jsp/swp/etc/swpPrivacy.jsp")
                .version("1.0").build();
    }

}
>>>>>>> origin/dev
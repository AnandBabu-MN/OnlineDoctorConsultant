package com.odc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;


/**
 * 
 * @author Anand
 * @version 09/05/2022
 *
 */

@Configuration 
public class ODCconfig {
	@Bean
	public Docket config() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.odc.controller"))
				.paths(PathSelectors.any())
				.build();
}
}

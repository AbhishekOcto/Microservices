package com.bridgelabz.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@EntityScan("com.bridgelabz.springboot.model")
//@EnableJpaRepositories(basePackages = "com.bridgelabz.springboot.repository")
//@PropertySources({
//		@PropertySource({"file:C:\\Users\\Dell\\microservice\\student.properties"})
//})
public class SpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
	}

}

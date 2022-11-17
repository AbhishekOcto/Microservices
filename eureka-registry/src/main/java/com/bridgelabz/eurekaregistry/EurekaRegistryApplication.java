package com.bridgelabz.eurekaregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaRegistryApplication.class, args);
	}

}

//localhost:8083 to access eureka console
//start every service applications and refresh the console page, it will auto register ech service
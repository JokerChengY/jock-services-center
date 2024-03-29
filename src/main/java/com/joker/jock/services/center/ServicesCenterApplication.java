package com.joker.jock.services.center;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ServicesCenterApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicesCenterApplication.class, args);
	}

}

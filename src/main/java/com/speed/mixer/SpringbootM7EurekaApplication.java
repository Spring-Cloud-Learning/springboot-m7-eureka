package com.speed.mixer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpringbootM7EurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootM7EurekaApplication.class, args);
	}
}

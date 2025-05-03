package com.sit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class BootMsPoj13RandDEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootMsPoj13RandDEurekaServerApplication.class, args);
	}

}

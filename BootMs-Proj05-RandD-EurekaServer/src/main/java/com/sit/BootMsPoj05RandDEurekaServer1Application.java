package com.sit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class BootMsPoj05RandDEurekaServer1Application {

	public static void main(String[] args) {
		SpringApplication.run(BootMsPoj05RandDEurekaServer1Application.class, args);
	}

}

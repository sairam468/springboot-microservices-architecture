package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class BootMsPoj01RandDEurekaServer1Application {

	public static void main(String[] args) {
		SpringApplication.run(BootMsPoj01RandDEurekaServer1Application.class, args);
	}

}

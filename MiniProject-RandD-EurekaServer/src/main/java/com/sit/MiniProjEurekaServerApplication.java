package com.sit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MiniProjEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MiniProjEurekaServerApplication.class, args);
	}

}

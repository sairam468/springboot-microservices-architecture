package com.sit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class BootMsPoj02PublishingMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootMsPoj02PublishingMsApplication.class, args);
	}

}

package com.sit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class BootMsPoj05ConsumingMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootMsPoj05ConsumingMsApplication.class, args);
	}

}

package com.sit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class BootMsPoj06ConsumingMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootMsPoj06ConsumingMsApplication.class, args);
	}

}

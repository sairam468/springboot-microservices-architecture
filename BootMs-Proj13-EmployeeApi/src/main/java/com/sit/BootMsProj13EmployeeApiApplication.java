package com.sit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class BootMsProj13EmployeeApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootMsProj13EmployeeApiApplication.class, args);
	}

}

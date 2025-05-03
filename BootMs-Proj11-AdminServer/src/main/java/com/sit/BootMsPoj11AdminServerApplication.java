package com.sit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import de.codecentric.boot.admin.server.config.EnableAdminServer;

@SpringBootApplication
@EnableAdminServer
public class BootMsPoj11AdminServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootMsPoj11AdminServerApplication.class, args);
	}

}

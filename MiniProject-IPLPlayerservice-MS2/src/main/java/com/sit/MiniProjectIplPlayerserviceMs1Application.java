package com.sit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MiniProjectIplPlayerserviceMs1Application {

	public static void main(String[] args) {
		SpringApplication.run(MiniProjectIplPlayerserviceMs1Application.class, args);
	}

}

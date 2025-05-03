package com.sit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sit.client.IBillingServiceRestConsumer;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController
@RequestMapping("/shopping")
public class SearchServiceController {
	
	@Autowired
	private IBillingServiceRestConsumer client;

	@GetMapping("/details")
	@CircuitBreaker(name = "Shopping-Service", fallbackMethod = "billingFallback")
	public ResponseEntity<String> displayMessage() {
		System.out.println("ShoppingController :: client component class :: " + client.getClass());

		ResponseEntity<String> msg = client.getBillingData();

		return new ResponseEntity<>("Shopping the Items :: " + msg.getBody(), HttpStatus.OK);
	}

	// Fallback method must have same return type and matching parameters
	public ResponseEntity<String> billingFallback(Throwable t) {
		System.out.println("ShoppingServiceController fallback triggered :: " + t.getMessage());

		return new ResponseEntity<>("Billing Operations Are Out Of Service. Reason: " + t.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
	}
}

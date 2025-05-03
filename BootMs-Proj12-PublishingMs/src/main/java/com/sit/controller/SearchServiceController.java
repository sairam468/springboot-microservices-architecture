package com.sit.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController
@RequestMapping("/billing")
public class SearchServiceController {
	
	@GetMapping("/info")
	@CircuitBreaker(name = "Shopping-Service", fallbackMethod = "billingFallback")
	private String getBillingInfo() {
		return "We accept Card Payment,UPI Payment,NetBanking Payment, COD";
	}
	
	// Fallback method must have same return type and matching parameters
		public ResponseEntity<String> billingFallback(Throwable t) {
			System.out.println("ShoppingServiceController fallback triggered :: " + t.getMessage());

			return new ResponseEntity<>("Billing Operations Are Out Of Service. Reason: " + t.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}

}

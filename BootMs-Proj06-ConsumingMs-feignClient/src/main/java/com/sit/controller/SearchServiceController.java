package com.sit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sit.client.IBillingServiceRestConsumer;

@RestController
@RequestMapping("/shopping")
public class SearchServiceController {
	
	@Autowired
	private IBillingServiceRestConsumer client;
	
	@GetMapping("/details")
	private ResponseEntity<String> displayMessage() {
		
		ResponseEntity<String> msg=client.getBillingData();
		System.out.println("ShoppingController :: client comp class name :: "+client.getClass());

		return new ResponseEntity<String>("Shopping the Items :: "+msg,HttpStatus.OK);
	}
	
}

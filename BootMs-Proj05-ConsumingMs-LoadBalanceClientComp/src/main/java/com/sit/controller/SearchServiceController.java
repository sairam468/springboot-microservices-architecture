package com.sit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sit.client.ServiceRestConsumer;

@RestController
@RequestMapping("/shopping")
public class SearchServiceController {
	
	@Autowired
	private ServiceRestConsumer client;
	
	@GetMapping("/details")
	private ResponseEntity<String> displayMessage() {
		
		String msg=client.getServiceFromProvider();
		
		try {
			Thread.sleep(5000);
		}
		catch(Exception e) {e.printStackTrace();}
		return new ResponseEntity<String>("Shopping the Items :: "+msg,HttpStatus.OK);
	}
	
}

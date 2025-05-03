package com.sit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sit.client.ServiceRestConsumer;

@RestController
@RequestMapping("/search")
public class SearchServiceController {
	
	@Autowired
	private ServiceRestConsumer client;
	
	@GetMapping("/display")
	private String displayMessage() {
		
		String resBody=client.getServiceFromProvider();
		
		return resBody+" from Consumer";
	}

}

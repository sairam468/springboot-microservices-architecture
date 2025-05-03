package com.sit.controller;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
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
	private String displayMessage() {
		
		String resBody=client.getServiceFromProvider();
		
		String billAmt="Bill amount "+new Random().nextInt(100000);
		
		return resBody+" from Consumer \n"+billAmt;
	}
	
}

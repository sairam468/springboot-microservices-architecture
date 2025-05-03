package com.sit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/billing")
public class SearchServiceController {
	
	@GetMapping("/info")
	private String getBillingInfo() {
		return "We accept Card Payment,UPI Payment,NetBanking Payment, COD";
	}

}

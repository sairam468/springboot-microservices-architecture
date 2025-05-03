package com.sit.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/cust")
public class OperationRestController {

	@GetMapping("/display")
	public String displayData() {
		return "Customer Info will be displayed here... Welcome to Call Center... ";
	}
}

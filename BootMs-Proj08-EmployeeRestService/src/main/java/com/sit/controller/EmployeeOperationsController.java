package com.sit.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/emp")
public class EmployeeOperationsController {

	@Value("${dbuser}")
	private String user;
	
	@Value("${dbpwd}")
	private String pw;
	
	@GetMapping("/show")
	public String showData() {
		return "Employee Data Collected Through Config server :: User: "+user+"............. PassWord: "+pw;
	}
}

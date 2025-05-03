package com.sit.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee-api")
public class EmpOpController {

	@GetMapping("/report")
	public ResponseEntity<String> showMsg(){
		
		return new ResponseEntity<String>("Employee Operations Controller",HttpStatus.OK);
	}
}

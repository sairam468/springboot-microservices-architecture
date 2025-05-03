package com.sit.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("Billing-Service")
public interface IBillingServiceRestConsumer {

	@GetMapping("/billing/info")
	public ResponseEntity<String> getBillingData(); 
}

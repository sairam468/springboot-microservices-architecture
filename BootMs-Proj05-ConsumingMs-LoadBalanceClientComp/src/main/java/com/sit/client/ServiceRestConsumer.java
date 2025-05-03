package com.sit.client;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;



@Component
public class ServiceRestConsumer {
	
	@Autowired
	private LoadBalancerClient client;
	
	public String getServiceFromProvider() {
		ServiceInstance serviceInstance=client.choose("Billing-Service");
		
		URI uri = serviceInstance.getUri();
		
		String url=uri.toString()+"/billing/info";
		
		RestTemplate rt=new RestTemplate();
		
		ResponseEntity<String> response = rt.getForEntity(url,String.class);
		
		String res=response.getBody();
		
		return res;
		
	}

}

package com.sit.client;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;



@Component
public class ServiceRestConsumer {
	
	@Autowired
	private DiscoveryClient client;
	
	public String getServiceFromProvider() {
		List<ServiceInstance> listSi=client.getInstances("FirstPMs");
		
		ServiceInstance serviceInstance = listSi.get(0);
		
		String url=serviceInstance.getUri()+"/billing/info";
		
		RestTemplate rt=new RestTemplate();
		
		String res=rt.getForObject(url,String.class);
		
		return res;
		
	}

}

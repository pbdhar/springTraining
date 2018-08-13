package com.example.demo

import org.springframework.cloud.client.ServiceInstance
import org.springframework.cloud.client.discovery.DiscoveryClient

class MicroserviceClient {
	
	fun getEmployee(client:DiscoveryClient):Unit
	{
		
		var instances:ServiceInstance = client.getInstances("microservice-producer").get(0)
		println(instances)
		
	}
	
}
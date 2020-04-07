package com.codelovin.microservices.summationservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
public class SummationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SummationServiceApplication.class, args);
	}

}

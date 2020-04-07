package com.codelovin.microservices.summationservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "operands-service", url="http://localhost:8081")
public interface OperandsServiceClient {
	@RequestMapping(method = RequestMethod.GET, value = "/operands")
	ExistingOperands getOperandsFromConfigurations();
}

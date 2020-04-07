package com.codelovin.microservices.summationservice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class SummationController {

	@GetMapping("/summation/add/{operand1}/to/{operand2}")
	public ResponseEntity<SummationBean> addAndReturnResult(@PathVariable("operand1") Integer operand1, @PathVariable("operand2") Integer operand2) {
		
		// Get operands from operands-service		
		RestTemplate restTemplate = new RestTemplate();
		String operandsEndpoint = "http://localhost:8081/operands";
		ResponseEntity<ExistingOperands> response = restTemplate.getForEntity(operandsEndpoint, ExistingOperands.class);
		ExistingOperands exos = response.getBody();
		
		int fetchedOp1 = exos.getOperand1();
		int fetchedOp2 = exos.getOperand2();
		
		// Enhance the given operand values
		int finalOp1 = operand1 + fetchedOp1;
		int finalOp2 = operand2 + fetchedOp2;
		int port = 8100; //default
		
		SummationBean sb = new SummationBean(finalOp1 + finalOp2, port);
		return new ResponseEntity<>(sb, HttpStatus.OK);
	}
}

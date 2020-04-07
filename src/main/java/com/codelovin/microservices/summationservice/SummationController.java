package com.codelovin.microservices.summationservice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SummationController {

	@GetMapping("/summation/add/{operand1}/to/{operand2}")
	public ResponseEntity<SummationBean> addAndReturnResult(@PathVariable("operand1") Integer operand1, @PathVariable("operand2") Integer operand2) {
		
		// Get operands from operands-service
		int fetchedOp1 = 10;
		int fetchedOp2 = 20;
		
		// Enhance the given operand values
		int finalOp1 = operand1 + fetchedOp1;
		int finalOp2 = operand2 + fetchedOp2;
		int port = 8100; //default
		
		SummationBean sb = new SummationBean(finalOp1 + finalOp2, port);
		return new ResponseEntity<>(sb, HttpStatus.OK);
	}
}

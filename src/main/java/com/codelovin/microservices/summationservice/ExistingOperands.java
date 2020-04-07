package com.codelovin.microservices.summationservice;

public class ExistingOperands {
	private int operand1;
	private int operand2;
	
	public ExistingOperands() {}
	
	public ExistingOperands(int op1, int op2) {
		this.operand1 = op1;
		this.operand2 = op2;
	}

	public int getOperand1() {
		return operand1;
	}

	public int getOperand2() {
		return operand2;
	}
}

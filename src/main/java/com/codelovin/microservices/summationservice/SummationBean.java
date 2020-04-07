package com.codelovin.microservices.summationservice;

public class SummationBean {

	private int result;
	private int port;
	
	public SummationBean() {
	}
	
	public SummationBean(int result, int port) {
		this.result = result;
		this.port = port;
	}

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}
}

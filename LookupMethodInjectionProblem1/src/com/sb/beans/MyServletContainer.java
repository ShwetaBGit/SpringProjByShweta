package com.sb.beans;

public class MyServletContainer {

	private RequestHandler handler;

	//setter method
	public MyServletContainer(RequestHandler handler) {
		this.handler = handler;
	}

	public void procesRequest(String data) {
	      String result =  handler.handle(data);
		System.out.println("result :: " + result);
	}

}

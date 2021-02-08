package com.sb.beans;

public abstract class MyServletContainer {

	public MyServletContainer() {
		System.out.println("MyServletContainer: 0 param constructor");
	}

	public void processRequest(String data) {

		// get dependent object
		RequestHandler handler = getRequestHandler();
		handler.data(data);
	}

	public abstract RequestHandler getRequestHandler();
}

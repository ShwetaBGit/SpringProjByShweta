package com.sb.beans;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;


@Component("msc")
public abstract class MyServletContainer {

	public MyServletContainer() {
		System.out.println("MyServletContainer: 0 param constructor");
	}

	public void processRequest(String data) {

		RequestHandler handler = getRequestHandler();
		handler.data(data);
	}

	@Lookup(value = "rh")
	public abstract RequestHandler getRequestHandler();
}

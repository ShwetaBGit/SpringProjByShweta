package com.sb.beans;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component("rh")
public class RequestHandler {

	public static int count;

	public RequestHandler() {

		count++;
		System.out.println("RequestHandler:: 0 param constructor");
	}

	public void data(String data) {
		System.out.println("handling request " + count + "with data " + data);
	}

}

package com.sb.beans;

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

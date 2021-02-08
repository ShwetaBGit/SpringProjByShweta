package com.sb.beans;

public class RequestHandler {

	private static int count;

	public RequestHandler() {

		count++;
		System.out.println("RequestHandler::0 - param constructor");
	}

	public String process(String data) {

		System.out.println("resuest count  " + count);
		return data;
	}

}

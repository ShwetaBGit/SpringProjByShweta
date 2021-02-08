package com.sb.beans;

public class CngEngine implements Engine {

	public CngEngine() {
		System.out.println("CngEngine.CngEngine()");
	}

	@Override
	public void start() {
		System.out.println("CngEngine.start()");
	}

	@Override
	public void stop() {
		System.out.println("CngEngine.stop()");

	}

}

package com.sb.beans;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("veh")

public class Vehicle {

	// @Autowired
	// @Qualifier("petrol")
	// @Qualifier("cng")
	private Engine engine;

	// setter injection

	//@Autowired
	//@Qualifier("petrol")
	// @Qualifier("cng")

	//public void setEngine(Engine engine) {
		//this.engine = engine;
	//}

	@Autowired
	//@Qualifier("cng")
	//@Inject("petrol")
	@Named("petrol")
	// constructor-1 param
	public Vehicle(Engine engine) {
		this.engine = engine;
	}

	public void journey(String source, String destination) {

		engine.start();
		engine.stop();
	}
}

package com.sb.beans;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.FactoryBean;

public class Vehicle1 {

	private String enggId;

	public Vehicle1() {

		System.out.println("Vehicle1.Vehicle1()");
	}

	public String getEnggId() {
		return enggId;
	}

	public void setEnggId(String enggId) {
		this.enggId = enggId;
	}

	public void start(BeanFactory factory) {
		System.out.println("Vehicle1.start()");
		Engine engine = factory.getBean(enggId, Engine.class);

		engine.start();

		System.out.println("vehicle moved for journey");
	}

}

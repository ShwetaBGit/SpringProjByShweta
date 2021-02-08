package com.sb.beans;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class Vehicle {
	
	
	private String enggId;
	
	public Vehicle() {
	
	System.out.println("Vehicle.Vehicle()");
	}

	public String getEnggId() {
		return enggId;
	}

	public void setEnggId(String enggId) {
		this.enggId = enggId;
	}

	
	public void move() {
		BeanFactory factory = null;
		
		factory = new XmlBeanFactory(new FileSystemResource("src/com/sb/cfgs/applicationContext.xml"));
		 Engine engine = factory.getBean(enggId,Engine.class);
		 engine.start();
		System.out.println("engine :: " +engine);
		 
	}

	@Override
	public String toString() {
		return "Vehicle [enggId=" + enggId + "]";
	}
	
	
	
	
}


package com.sb.factoryClass;

public class Flipkart {

	int id;

	 public void setId(int id) {
		this.id = id;
	}

	public void purchase() {
		System.out.println("thank u for purchasing the product");
	
	DTDC dtdc = DTDCFactory.getInstance();
	 dtdc.delivered(id);
	
	}
	
}

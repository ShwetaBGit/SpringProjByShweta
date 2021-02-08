package com.sb.approach4;

import com.sb.factoryClass.DTDC;

public class Flipcart extends DTDC {

	int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	public void purchase(int id) {
		System.out.println("Thank u for purchasing the product");
		delivered(id);
	}
	
	
	
	
   	
	
	
}

package com.sb.compositon;

public class Flipcart {
	
	int id;
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	DTDC dtdc = new DTDC();
	
	public void purchase() {
		System.out.println("thank u for purchasing the product");
	
		System.out.println("your parcel or");
			dtdc.deliver(id);
	
	}
	
}

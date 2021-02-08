package com.sb.approach5;

public class Flipcart {

	private DTDC dtdc;
	int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	

	public DTDC getDtdc() {
		return dtdc;
	}

	public void setDtdc(DTDC dtdc) {
		this.dtdc = dtdc;
	}

	public void purchase(int id,DTDC dtdc) {
		System.out.println("Thank u for purchasing the poduct");

		dtdc.deliver(id);

	}

}

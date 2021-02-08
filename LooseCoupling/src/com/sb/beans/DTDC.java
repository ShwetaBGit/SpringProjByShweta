package com.sb.beans;

public class DTDC implements Courier {

	@Override
	public String deliverd(int id) {

		return "product " + id + "  will be deliverd soon";

	}

}

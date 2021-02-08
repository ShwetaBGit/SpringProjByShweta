package com.sb.beans;

public class BlueDart implements Courier {

	@Override
	public final String  deliverd(int id) {

		System.out.println("prodcut will be dilivered by bluedart");
		return "ready to deliver the product " +id;
	}

}

package com.sb.beans;

import java.util.Random;

public class Flipkart {

	private Courier courier;

	public Courier getCourier() {
		return courier;
	}

	public void setCourier(Courier courier) {
		this.courier = courier;
	}

	public String purchase(String items1[]) {

		System.out.print("Thank u for purchasing the product :: ");
		for (String items : items1) {

			System.out.println(items + ",");

		}

		Random rad = new Random();
		int id = rad.nextInt(700000);

		String status = courier.deliverd(id);

		return status + " bill amount for order id " + id + " is RS7000;";

	}
}

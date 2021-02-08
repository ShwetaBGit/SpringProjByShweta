package com.sb.beans;

import org.springframework.stereotype.Component;

@Component("firstFlight")
public class FirstFlight implements Courier {

	@Override
	public String deliverd(int id) {
	
		return "product " +id + "will be delivered soon"; 
	}
}

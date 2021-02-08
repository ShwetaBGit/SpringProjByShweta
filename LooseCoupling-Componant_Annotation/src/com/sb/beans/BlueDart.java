package com.sb.beans;

import org.springframework.stereotype.Component;

@Component("bd")
public class BlueDart implements Courier {

	@Override
	public final String deliverd(int id) {

		System.out.println("prodcut will be dilivered by bluedart");
		return "ready to deliver the product " + id +"\n";
	}

}

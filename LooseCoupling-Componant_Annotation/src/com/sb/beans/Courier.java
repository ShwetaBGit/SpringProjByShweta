package com.sb.beans;

import org.springframework.stereotype.Component;

@Component("courier")
public interface Courier {

	public String deliverd(int id);

	
	
}

package com.sb.bo;

import lombok.Data;

@Data
public class CustomerBO extends BaseBo {
	
	private float billAmt;
	
	
	public CustomerBO(){
		System.out.println("CustomerBO:: 0 -param constructor");
	}

}

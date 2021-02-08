package com.sb.bo;

import lombok.Data;

@Data
public class StudentBO extends BaseBo {

	public String cource;

	public StudentBO() {
		System.out.println("StudentBO: 0 -param constructor");
	}

}

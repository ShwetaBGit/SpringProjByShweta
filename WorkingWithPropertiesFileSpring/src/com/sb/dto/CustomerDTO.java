package com.sb.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class CustomerDTO implements Serializable {

	private int id;
	private String cname;
	private float pamt, intramtl,rate,time;

}

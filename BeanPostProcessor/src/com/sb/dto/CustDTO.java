package com.sb.dto;

import java.util.Date;

import lombok.Data;

@Data
public class CustDTO  {
	
	private int id;
	private String name;
	private float billAmt;
	private Date doj;

}

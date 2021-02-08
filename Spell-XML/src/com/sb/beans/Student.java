package com.sb.beans;

import java.util.Date;
import java.util.List;

import lombok.Data;

@Data
public class Student {

	private int regNo;
	private String name;
	private List<String> availedCource;
	private String[] availedFaculties;
	private int courceTotalFee;
	private int courceDurationTotal;
	private int finalFee;
	private Date date;

}

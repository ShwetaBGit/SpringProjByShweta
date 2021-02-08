package com.sb.beans;

import java.util.List;
import java.util.Map;

import lombok.Data;

@Data
public class Cource {

	private String domain;
	private String institution;
	private List<String> cources;
	private String[] faculties;
	private Map<String,Integer> prices;
	private int discount;
	private Map<String,Integer> duration;
}

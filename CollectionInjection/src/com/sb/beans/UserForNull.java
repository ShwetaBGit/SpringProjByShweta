package com.sb.beans;

import java.sql.Date;

public class UserForNull {
	
	
	private int id;
	private String name;
	private Date date;
	public UserForNull(int id, String name, Date date) {
		super();
		this.id = id;
		this.name = name;
		this.date = date;
	}
	@Override
	public String toString() {
		return "UserForNull [id=" + id + ", name=" + name + ", date=" + date + "]";
	}
	
}

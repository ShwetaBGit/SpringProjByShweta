package com.sb.beans;

import java.util.Calendar;
import java.util.Date;

import org.springframework.beans.factory.annotation.Required;

public class WishGenerated {

	// bean property
	private String name;

	private Date date;

	private int no;
	private long phone;

	public int getNo() {
		return no;
	}

	@Required
	public void setNo(int no) {
		this.no = no;
	}

	public long getPhone() {
		return phone;
	}

	@Required
	public void setPhone(long phone) {
		this.phone = phone;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	int hour = 0;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	// business logic
	public String generateWishMsg() {

		Calendar cal = Calendar.getInstance();

		int hour = date.getHours();

		if (hour < 12) {
			return "Good Morning" + name + "\n have a nice day";
		} else if (hour < 16) {
			return "Good afternoon " +name;
		} else if (hour < 20) {
			return "Good evening ";
		} else
			return "Good night " + name + "\nSweet Dream \ntake care \nsleep tight";

	}

}

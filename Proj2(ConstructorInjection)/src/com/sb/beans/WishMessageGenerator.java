package com.sb.beans;

import java.util.Calendar;
import java.util.Date;

public class WishMessageGenerator {

	private String name;
	Date date;
	int hour;

	public WishMessageGenerator(String name, Date date) {

		this.name = name;
		this.date = date;
	}

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

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public String getWishMsg() {

		Calendar cal = Calendar.getInstance();
		hour = Calendar.getInstance().get(cal.HOUR_OF_DAY);

		if (hour < 12) {
			return "Good Morning " + name;
		}

		else if (hour < 16) {
			return "Good Afternoon " + name;
		}

		else if (hour < 20) {
			return "Good Evening " + name;
		} else {
			return "Good night" + name;
		}
	}// method

}

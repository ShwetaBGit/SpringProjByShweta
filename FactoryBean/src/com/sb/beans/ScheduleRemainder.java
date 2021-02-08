package com.sb.beans;

import java.util.Date;

public class ScheduleRemainder {

	private Date date;

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "ScheduleRemainder [date=" + date + "]";
	}

}

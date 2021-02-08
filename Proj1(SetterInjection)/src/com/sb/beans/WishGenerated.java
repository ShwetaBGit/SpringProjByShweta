package com.sb.beans;

import java.util.Calendar;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wish")
public class WishGenerated {

	@Autowired
	private Calendar cal;
	// bean property
	private String name;
	private Date date;

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
	public String generateWishMsg(String name) {

		int hour = cal.get(Calendar.HOUR_OF_DAY);
		if (hour > 12)
			return "Good Morning" + name + "\n have a nice day";

		else if (hour > 16)
			return "Good afternoon";
		else if (hour > 20)
			return "Good evening ";

		else
			return "Good night " + name + "\nSweet Dream \ntake care \nsleep tight";

	}

}

package com.sb.beans;

import java.util.Calendar;
import java.util.Date;

import javax.inject.Inject;

import org.springframework.stereotype.Component;

@Component("wmsg")
public class WishGenerated {

	// @Inject
	private Calendar cal;

	int hour = 0;

	// @Inject
	// constructor
	public WishGenerated(Calendar cal) {
		this.cal = cal;
	}

	//@Inject
	public void setCal(Calendar cal) {
		this.cal = cal;
	}

	@Inject
	public void assign(Calendar cal) {

		this.cal = cal;
	}

	// business logic
	public String generateWishMsg(String name) {

		int hour = cal.get(Calendar.HOUR_OF_DAY);

		if (hour < 12)
			return "Good Morning" + name + "\n have a nice day";

		else if (hour < 16)
			return "Good afternoon " + name;
		else if (hour < 20)
			return "Good evening ";

		else
			return "Good night " + name + "\nSweet Dream \ntake care \nsleep tight";

	}

}

package com.sb.beans;

import java.util.Calendar;
import java.util.Date;
import javax.annotation.Resource;
import javax.inject.Named;

@Named("wmsg")
public class WishGenerated {

	// @Resource
	private Calendar cal;

	int hour = 0;

//@Resource
//public void setCal(Calendar cal) {
	// this.cal = cal;
	// }

	@Resource
	public void assign(Calendar cal) {
		this.cal = cal;
	}

	// business logic
	public String generateWishMsg(String name) {

		hour = cal.get(Calendar.HOUR_OF_DAY);

		if (hour < 12)
			return "Good Morning" + name + "\n have a nice day";

		else if (hour < 16)
			return "Good afternoon " + name;
		else if (hour < 20)
			return "Good evening " + name;

		else
			return "Good night " + name + "\nSweet Dream \ntake care \nsleep tight";

	}

}

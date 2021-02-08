package com.sb.beans;

import java.util.Calendar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("wmsg")
public class WishMessageGenerator {

	// @Autowired

//	@Qualifier("cal6")
	private Calendar cal;

	// at setter(-)
	// @Autowired
	// @Qualifier("cal6")
	// public void setCal(Calendar cal) {
	// this.cal = cal;
	// }

	
	
	@Autowired
	//parameterized constructor
	public WishMessageGenerator(@Qualifier("cal1")Calendar cal) {
		this.cal = cal;
	}
   
	// at orbitary method
	//@Autowired(required = true)
	// @Qualifier("cal6")
	public void assign(Calendar cal) {

		this.cal = cal;
	}

		public String generateWishMsg(String uname) {

		int hour = 0;
		System.out.println("cal :: " + cal);
		hour = cal.get(Calendar.HOUR_OF_DAY);

		if (hour < 12) {
			return "Good Morning " + uname;
		} else if (hour < 16) {
			return "good afternoon " + uname;
		} else if (hour < 20) {
			return "good evening " + uname;

		} else {
			return "good night " + uname;
		}
	}

	@Override
	public String toString() {
		return "WishMessageGenerator [cal=" + cal + "]";
	}

}

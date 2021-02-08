package com.sb.beans;

import java.util.Arrays;

//target class
public class TravelAgent {

	private TourPlan tp;


	//by using setter inection
	public void setPlaces(TourPlan tp) {
		System.out.println("TravelAgent.setPlaces()");
	       this.tp = tp;
	}
	

	//by using constructor
/*	public TravelAgent(TourPlan tp) {
		
		this.tp = tp;
	} */


	@Override
	public String toString() {
		return "TravelAgent [tp=" +tp + "]";
	}
}

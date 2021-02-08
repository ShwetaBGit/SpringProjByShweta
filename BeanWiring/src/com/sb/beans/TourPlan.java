package com.sb.beans;

import java.util.Arrays;

public class TourPlan {
	
	
	private String places[];

	public void setPlaces(String places[]) {
		System.out.println("TourPlan.setPlaces()");
		this.places = places;
	}
	

	@Override
	public String toString() {
		return "TourPlan [tourPlan=" + Arrays.toString(places) + "]";
	}

	
	
	
	

}

package com.sb.beans;

public class IntrAmtCalculator {

	private IntrAmtDetails details;

	public IntrAmtCalculator(IntrAmtDetails details) {
		System.out.println("IntrAmtCalculator:: 1 param constructor");
		this.details = details;
	}

	public float calCalAmt() {

		return details.getPrinciple() * details.getRate() * details.getTime() / 100.0f;
	}

}

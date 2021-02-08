package com.sb.beans;

public class IntrAmtDetails {

	private float principle;
	private float time;
	private float rate;

	public float getPrinciple() {
		return principle;
	}

	public void setPrinciple(float principle) {
		this.principle = principle;
	}

	public float getTime() {
		return time;
	}

	public void setTime(float time) {
		this.time = time;
	}

	public float getRate() {
		return rate;
	}

	public void setRate(float rate) {
		this.rate = rate;
	}

	@Override
	public String toString() {
		return "IntrAmtDetails [principle=" + principle + ", time=" + time + ", rate=" + rate + "]";
	}

}

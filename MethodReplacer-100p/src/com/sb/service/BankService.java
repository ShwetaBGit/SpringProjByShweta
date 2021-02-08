package com.sb.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("bank")
public class BankService {

	@Value("1.5")
	private float rate;


	public void setRate(float rate) {
	this.rate = rate;
}


	public float calIntrAmt(float pamt, float time) {

		System.out.println("BankService.calIntrAmt()");

		return (pamt * time * 2.0f) / 100;
	}

}

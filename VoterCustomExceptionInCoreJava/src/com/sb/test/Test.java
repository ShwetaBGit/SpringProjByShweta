package com.sb.test;

import com.sb.voter.Voter;

public class Test {

	public static void main(String[] args) {

		Voter v = new Voter("shweta", 17);

		System.out.println(v.chechEligibility());

	}

}

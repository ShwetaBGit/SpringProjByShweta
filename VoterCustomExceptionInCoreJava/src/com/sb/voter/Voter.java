package com.sb.voter;

public class Voter {

	String name;
	int age;

	public Voter(String name, int age) {

		this.name = name;
		this.age = age;
	}

	public String chechEligibility() {

		if (age < 18)
			throw new LessThan18(name + " you are not eligible for voting");

		else
			return name + " you are eligible for voting";

	}
}

package com.sb.beans;

import java.util.Set;

public class StudentSet {

	private Set<String> phoneNo;

	public Set<String> getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(Set<String> phoneNo) {
		this.phoneNo = phoneNo;
	}

	@Override
	public String toString() {
		return "StudentSet [phoneNo=" + phoneNo + "]";
	}
	
	
	
	
}

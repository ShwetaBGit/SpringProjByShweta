package com.sb.beans;

import java.util.Map;

public class StudentMap {
	
	
	private Map<String, String> facultySubject;
	
	private Map<?,?> phoneNo;

	public Map<String, String> getFacultySubject() {
		return facultySubject;
	}

	public void setFacultySubject(Map<String, String> facultySubject) {
		this.facultySubject = facultySubject;
	}

	public Map<?, ?> getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(Map<?, ?> phoneNo) {
		this.phoneNo = phoneNo;
	}

	@Override
	public String toString() {
		return "StudentMap [facultySubject=" + facultySubject + ", phoneNo=" + phoneNo + "]";
	}
}

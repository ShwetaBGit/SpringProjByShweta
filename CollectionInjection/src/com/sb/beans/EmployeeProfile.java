package com.sb.beans;

import java.util.Properties;

public class EmployeeProfile {
	
	private Properties empDesgs;

	public Properties getEmpDesgs() {
		return empDesgs;
	}

	public void setEmpDesgs(Properties empDesgs) {
		this.empDesgs = empDesgs;
	}

	@Override
	public String toString() {
		return "EmployeeProfile [empDesgs=" + empDesgs + "]";
	}
}

package com.sb.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("ba")
public class BankApprover {

	
	//@Autowired
	private LoanDetail details;

	public BankApprover() {
		System.out.println("BankApprover.BankApprover()");

	}

	public LoanDetail getDetails() {
		return details;
	}

	@Autowired
	@Qualifier("loan")
	public void setDetails(LoanDetail details) {
		this.details = details;
	}

	@Override
	public String toString() {
		return "BankApprover [details=" + details + "]";
	}

	public String approveLoaner() {

		if (details.getLoanType().equals("two-wheeler")) {

			return "loan is approved";
		} else {
			return "loan not approved";
		}

	}// method
}// class

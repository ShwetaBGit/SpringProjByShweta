package com.sb.beans;

public class BankApprover {

	private LoanDetail details;

	public BankApprover() {
		System.out.println("BankApprover.BankApprover()");

	}

	public LoanDetail getDetails() {
		return details;
	}

	public void setDetails(LoanDetail details) {
		this.details = details;
	}

	
	
	
	@Override
	public String toString() {
		return "BankApprover [details=" + details + "]";
	}

	public String approveLoaner() {
		
		 if(details.getLoanType().equals("two-wheeler")) {
			 
			 return "loan is approved";
		 }
		 else {
			 return "loan not approved";
		 }
		
	}//method
}//class

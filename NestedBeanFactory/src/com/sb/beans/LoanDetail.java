package com.sb.beans;

public class LoanDetail {
	
	private int loanId;
	private String loanType;
	private String customer;
	
	
	public LoanDetail() {
		System.out.println("LoanDetail.LoanDetail()");
	}


	public int getLoanId() {
		return loanId;
	}


	public void setLoanId(int loanId) {
		this.loanId = loanId;
	}


	public String getLoanType() {
		return loanType;
	}


	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}


	public String getCustomer() {
		return customer;
	}


	public void setCustomer(String customer) {
		this.customer = customer;
	}


	@Override
	public String toString() {
		return "LoanDetail [loanId=" + loanId + ", loanType=" + loanType + ", customer=" + customer + "]";
	}
	
	
}

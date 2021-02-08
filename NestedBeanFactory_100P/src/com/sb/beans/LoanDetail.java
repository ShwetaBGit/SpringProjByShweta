package com.sb.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("loan")
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

	@Value("101")
	public void setLoanId(int loanId) {
		this.loanId = loanId;
	}

	
	public String getLoanType() {
		return loanType;
	}

	
	@Value("two-wheeler")
	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}

	public String getCustomer() {
		return customer;
	}

	@Value("shweta")
	public void setCustomer(String customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "LoanDetail [loanId=" + loanId + ", loanType=" + loanType + ", customer=" + customer + "]";
	}

}

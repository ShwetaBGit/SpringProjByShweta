package com.sb.beans;

public class B {

	A a;

/*	public B(A a) {
		this.a = a;
	} */
	
	//by using setter injection
	
	public void setA(A a) {
		this.a = a;
	}
	
	public A getA() {
		return a;
	}

}

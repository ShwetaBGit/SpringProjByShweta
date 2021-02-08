package com.sb.beans;

public class A {

	B b;

	// by using constructor

	/* public A(B b) {
		this.b = b;

		System.out.println("A.A()");
	} */

	// by using setter injection
	public B getB() {
		return b;
	}

	public void setB(B b) {
		this.b = b;
	}

	
	
public String toString() {
	return b + "";
}
		
}

package com.sb.beas;

public class A {
	
	public synchronized void first(B b) {
	 System.out.println("called a.first");
		b.last();
	
	}
	
	public  synchronized void last() {
		System.out.println("A.last()");
		
	}

}

package com.sb.beas;

public class B {
	
	
	public  synchronized void bar(A a) {
	System.out.println("called B.bar()");
	a.last();
	}
	
	
public synchronized void last() {
	
	System.out.println("last method B.last()");
	
  }
}

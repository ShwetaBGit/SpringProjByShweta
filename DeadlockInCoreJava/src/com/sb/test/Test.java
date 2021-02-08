package com.sb.test;

import com.sb.beas.A;
import com.sb.beas.B;

public class Test {
	 A a = new A();
     
     B b = new B();
    

	
	public void run() {
		
		b.bar(a);
		
	}
	
	public Test() {
		Thread t = new Thread();
		t.start();
	
		a.first(b);
	}

	public static void main(String[] args) {

		new Test();
	     }

}

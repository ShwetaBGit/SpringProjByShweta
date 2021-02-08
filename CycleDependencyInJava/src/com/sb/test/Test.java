package com.sb.test;

import com.sb.beans.A;
import com.sb.beans.B;

public class Test {

	public static void main(String[] args) {

   A a = new A();
   
   B b = new B();
   
    a.setB(b);
		 
	b.setA(a);
	
	System.out.println(" a " +a);
	//System.out.println("b " +b);
		
	}
}

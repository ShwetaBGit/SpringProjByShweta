package com.sb.beans;

import java.util.Random;

public class Student {
	private Cources cource;
	
   public Cources getCource() {
		return cource;
	}

public void setCource(Cources cource) {
		this.cource = cource;
	}

 public String admission(String subject[]) {

		System.out.println("Thank u for taking admission here");

		System.out.print("this are  " );
		
	 for(String subject1 : subject ) {
		 System.out.print( subject1 + " ");
	 }
          
		String cource1 = cource.material();
		

		return cource1;
	}

}

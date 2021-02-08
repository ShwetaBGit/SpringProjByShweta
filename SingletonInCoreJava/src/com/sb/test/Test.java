package com.sb.test;

public class Test {
	
	
	private static Test t;
	static int count;
	
	private Test() {
		
	
	}
	
	public static Test getInstance() {
		
		 if(t==null)
			t = new Test();
		    return t;
		  
	}
	
	
	/*public static void main(String[] args) {

		Test t1 = Test.getInstance();
		Test t2 = Test.getInstance();
		
		System.out.println(t1.hashCode()+ " " +t2.hashCode());
		System.out.println(count +" object created");
	} */
	
	



}

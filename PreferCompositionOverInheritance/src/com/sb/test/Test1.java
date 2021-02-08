package com.sb.test;

public class Test1 {

	public static void main(String[] args) {

		A1 a = new A1();

		float res = a.a1();
		System.out.println(res);

		System.out.println("------------");
		B1 b = new B1();
		int bres = b.y();

		int bres1 = b.a1();
		System.out.println(bres + ".... " + bres1);

		System.out.println("+++++++++++++++++++++++++++==");


		}

}

package com.sb.jndiRegistry;

import javax.naming.InitialContext;
import javax.naming.NamingException;

public class Flipkart {

		public void purchase(int id) throws NamingException {

		System.out.println("thanks for purchasing the product");

		InitialContext ic = new InitialContext();

		DTDC dtdc = (DTDC) ic.lookup("cr");
		System.out.println("dtdc " + dtdc.getClass() );
		dtdc.delivered(id);

	}
}

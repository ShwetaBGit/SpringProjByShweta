package com.sb.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.sb.beams.Bike;

public class Test {

	public static void main(String[] args) {

		FileSystemResource res = new FileSystemResource("src/com/sb/cfgs/applicationContext.xml");

		BeanFactory factory = new XmlBeanFactory(res);

		//Bike bike1 = factory.getBean("pulsor1", Bike.class);
       
		//System.out.println("bike1:: " +bike1);
		
		Bike bike2 = factory.getBean("pulsor2", Bike.class);
	       
		
		System.out.println("Bike2 :: " +bike2);
	 
		Bike bike3 = factory.getBean("pulsor3", Bike.class);
	    
	System.out.println("bike3 :: " +bike3);
	}
}

package com.sb.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.sb.beans.Vehicle;

public class Test {

	public static void main(String[] args) {

		FileSystemResource res = null;

		res = new FileSystemResource("src/com/sb/cfgs/applicationContext.xml");

		BeanFactory factory = new XmlBeanFactory(res);

		Vehicle veh1 = factory.getBean("veh", Vehicle.class);

		veh1.move();
		System.out.println("vehicle " + veh1);

		System.out.println(veh1.hashCode());

		Vehicle veh2 = factory.getBean("veh", Vehicle.class);

		veh2.move();
		System.out.println("vehicle " + veh2);

		//System.out.println(veh2.hashCode());
		
		System.out.println(veh1.hashCode() +" " +veh2.hashCode());

	}

}

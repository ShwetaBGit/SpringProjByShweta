package com.sb.test;

import java.nio.file.FileSystemAlreadyExistsException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.sb.beans.Vehicle;

public class ClientTest {

	public static void main(String[] args) {
		System.out.println("in main");
		ApplicationContext ctx;
		
		
		ctx = new FileSystemXmlApplicationContext("src/com/sb/cfgs/applicationContext.xml");

		//ctx = new ClassPathXmlApplicationContext("src/com/sb/cfgs/applicationContext.xml");
		System.out.println("ctx created");

		Vehicle vehicle = ctx.getBean("v",Vehicle.class);
		System.out.println("vehicle called");
		// System.out.println("vehicle called");

		vehicle.journey("mumbai ", "hyd");
		vehicle.entertainment();
		vehicle.sounHorn();

	}

}

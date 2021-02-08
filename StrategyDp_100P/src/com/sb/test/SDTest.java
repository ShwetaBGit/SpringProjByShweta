package com.sb.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sb.beans.Vehicle;
import com.sb.config.AppConfig;

public class SDTest {

	public static void main(String[] args) {

		ApplicationContext ctx = null;

		ctx = new AnnotationConfigApplicationContext(AppConfig.class);

		Vehicle vehicle = ctx.getBean("veh", Vehicle.class);

		vehicle.journey("mumbai","goa");
	}

}

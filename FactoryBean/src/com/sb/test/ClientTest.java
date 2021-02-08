package com.sb.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.sb.beans.ScheduleRemainder;

public class ClientTest {

	public static void main(String[] args) {

		ApplicationContext ctx = null;

		ctx = new FileSystemXmlApplicationContext("src/com/sb/cfgs/applicationContext.xml");

		ScheduleRemainder sremainder = ctx.getBean("sr", ScheduleRemainder.class);
 
		     System.out.println(sremainder);
	}

}

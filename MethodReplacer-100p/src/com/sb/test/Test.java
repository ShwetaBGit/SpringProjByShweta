package com.sb.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.sb.config.AppConfig;
import com.sb.service.BankService;

public class Test {

	public static void main(String[] args) {

		/*
		 * ApplicationContext ctx = new
		 * FileSystemXmlApplicationContext("src/com/sb/cfgs/applicationContext.xml");
		 * 
		 * BankService service = ctx.getBean("bank", BankService.class);
		 * 
		 * float a = service.calIntrAmt(20000, 20);
		 * 
		 * System.out.println(a);
		 */

		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		BankService ba = ctx.getBean("bank", BankService.class);
		System.out.println(ba.calIntrAmt(8000, 12));
	}

}

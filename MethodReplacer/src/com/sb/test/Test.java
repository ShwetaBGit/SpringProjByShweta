package com.sb.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.sb.service.BankService;

public class Test {

	public static void main(String[] args) {

		ApplicationContext ctx = new FileSystemXmlApplicationContext("src/com/sb/cfgs/applicationContext.xml");

		BankService service = ctx.getBean("bank", BankService.class);

		float a = service.calIntrAmt(20000, 20);

		System.out.println(a);
	}

}

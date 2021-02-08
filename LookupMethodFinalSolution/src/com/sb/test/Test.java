package com.sb.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.sb.beans.MyServletContainer;

public class Test {

	public static void main(String[] args) {

		ApplicationContext ctx = null;

		ctx = new FileSystemXmlApplicationContext("src/com/sb/cfgs/applicationContext.xml");

		MyServletContainer container = ctx.getBean("msc", MyServletContainer.class);

		container.processRequest("shweta");
		container.processRequest("aman");
		System.out.println(container.getClass());
	}

}

package com.sb.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.sb.beans.PropTestBeans;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ctx = null;
		ctx = new FileSystemXmlApplicationContext("src/com/sb/field/applicationContext.xml");

		PropTestBeans test = ctx.getBean("prop",PropTestBeans.class);

		System.out.println(test);
	}

}

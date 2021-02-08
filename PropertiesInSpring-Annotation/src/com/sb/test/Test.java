package com.sb.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.sb.beans.PropsTestBean;

public class Test {

	public static void main(String[] args) {

		ApplicationContext ctx = null;

		ctx = new FileSystemXmlApplicationContext("src/com/sb/cfgs/applicationContext.xml");

		PropsTestBean prop = ctx.getBean("prop",PropsTestBean.class);

		System.out.println(prop);

	}

}

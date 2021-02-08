package com.sb.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

import com.sb.beans.MyServletContainer;

public class Test {

	public static void main(String[] args) {

		/*
		 * //ApplicationContext ctx = null;
		 * 
		 * 
		 * BeanFactory=null; //ctx = new
		 * FileSystemXmlApplicationContext("src/com/sb/cfgs/applicationContext.xml");
		 * 
		 * 
		 * //MyServletContainer container = ctx.getBean("msc",MyServletContainer.class);
		 * //container.procesRequest("hi"); container.procesRequest("hello");
		 */

		FileSystemResource res = new FileSystemResource("src/com/sb/cfgs/applicationContext.xml");

		BeanFactory factory = null;
		factory = new XmlBeanFactory(res);

		MyServletContainer container = factory.getBean("msc", MyServletContainer.class);
		container.procesRequest("shweta");
		container.procesRequest("aman");
		
		container.procesRequest("vrushali");

	}

}

package com.sb.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

import com.sb.beans.WishGenerated;

public class ClientTest {

	
	public static void main(String[] args) {

		ApplicationContext ctx = null;

		ctx = new FileSystemXmlApplicationContext("src/com/sb/cfgs/applicationContext.xml");

		WishGenerated wish = ctx.getBean("wmsg", WishGenerated.class);

		System.out.println(wish.generateWishMsg("s"));
	}

}

package com.sb.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.io.FileSystemResource;

import com.sb.beans.WishGenerated;
import com.sb.config.AppConfig;

public class ClientTest {

	public static void main(String[] args) {

		ApplicationContext ctx = null;

		ctx = new AnnotationConfigApplicationContext(AppConfig.class);

		WishGenerated wg = ctx.getBean("wish", WishGenerated.class);

		System.out.println(wg.generateWishMsg("shweta"));
	}

}

package com.sb.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.RequiredAnnotationBeanPostProcessor;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.sb.beans.WishMessageGenerator;

public class ClientTest {

	public static void main(String[] args) {

	/*	DefaultListableBeanFactory factory = null;
		factory = new DefaultListableBeanFactory();

		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);

		reader.loadBeanDefinitions("com/sb/cfgs/applicationContext.xml");

		RequiredAnnotationBeanPostProcessor bpp = new RequiredAnnotationBeanPostProcessor();
		factory.addBeanPostProcessor(bpp);

		WishMessageGenerator msg = factory.getBean("wmsg", WishMessageGenerator.class);

		String result = msg.generateWishMsg("shweta");

		System.out.println(result); */

		ApplicationContext ctx = null;
		ctx = new FileSystemXmlApplicationContext("src/com/sb/cfgs/applicationContext.xml");

		WishMessageGenerator msg1 = ctx.getBean("wmsg", WishMessageGenerator.class);
		System.out.println(msg1.generateWishMsg("ss"));
        }
}

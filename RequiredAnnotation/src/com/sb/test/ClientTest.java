package com.sb.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.RequiredAnnotationBeanPostProcessor;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.sb.beans.WishGenerated;

public class ClientTest {

	public static void main(String[] args) {

		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();

		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/sb/cfgs/applicationContext.xml");

		RequiredAnnotationBeanPostProcessor bpp = new RequiredAnnotationBeanPostProcessor();

		factory.addBeanPostProcessor(bpp);

		// get bean class obj
		WishGenerated wg = factory.getBean("wish", WishGenerated.class);

		String result = wg.generateWishMsg();

		System.out.println(result);

	}

}

package com.sb.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.sb.beans.WishMessageGenerator;

public class ClientTest {

	public static void main(String[] args) {

		FileSystemResource res = new FileSystemResource("src/com/sb/cfgs/applicationContext.xml");

		BeanFactory factory = new XmlBeanFactory(res);

		WishMessageGenerator wg = factory.getBean("wish", WishMessageGenerator.class);

		String result = wg.getWishMsg();

		System.out.println(result);
	}

}

package com.sb.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.sb.beans.TravelAgent;

public class ClientTest {

	public static void main(String[] args) {

		FileSystemResource res = new FileSystemResource("src/com/sb/cfgs/applicationContext.xml");

		BeanFactory factory = new XmlBeanFactory(res);

		TravelAgent agent = factory.getBean("ta", TravelAgent.class);

		System.out.println(agent);
	}

}

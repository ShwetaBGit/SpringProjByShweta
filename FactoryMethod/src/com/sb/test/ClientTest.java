package com.sb.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class ClientTest {

	public static void main(String[] args) {

		FileSystemResource res = new FileSystemResource("src/com/sb/cfgs/applicationContext.xml");

		BeanFactory factory = new XmlBeanFactory(res);

	String concat1  = 	factory.getBean("s2",String.class);
		System.out.println(concat1.getClass() +" " +concat1);
		
		String substring1 = factory.getBean("s3",String.class);
		System.out.println(substring1.toString());
	
	
	       Class c = factory.getBean("s4",Class.class);
	
	       System.out.println(c.toString());
	}

}

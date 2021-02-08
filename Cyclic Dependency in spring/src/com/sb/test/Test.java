package com.sb.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.sb.beans.A;

public class Test {

	public static void main(String[] args) {

		
		FileSystemResource res = new FileSystemResource("src/com/sb/cfgs/applicationContext.xml");
		
		BeanFactory factory = new XmlBeanFactory(res);
		
	A a1 = 	factory.getBean("a", A.class);
	System.out.println(a1);	
		
	}

}

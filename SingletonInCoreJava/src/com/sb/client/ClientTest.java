package com.sb.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.sb.test.Test;

public class ClientTest {

	public static void main(String[] args) {

		
		
		 FileSystemResource res = new FileSystemResource("src/com/sb/cfgs/applicationContext.xml");
		 
		 
		 BeanFactory factory = new XmlBeanFactory(res);
		 
	Test t1	= factory.getBean("test",Test.class);
	
	
	 
	Test t2	= factory.getBean("test",Test.class);
	
	System.out.println(t1.hashCode() +" " +t2.hashCode());
	
	}

}

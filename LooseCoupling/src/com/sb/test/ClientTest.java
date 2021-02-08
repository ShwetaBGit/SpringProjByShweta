package com.sb.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.sb.beans.Flipkart;

public class ClientTest {

	public static void main(String[] args) {

		FileSystemResource res = new FileSystemResource("src/com/sb/cfgs/applicationContext.xml");
		
		 BeanFactory factory = new XmlBeanFactory(res);
		
	Flipkart fpk =	 factory.getBean("fp1",Flipkart.class);
		 
		//String result = fpk.purchase(new String[] {"shirt","jeans","makeup"});
	
	 String result = fpk.purchase(new String[] {"makeup","jeans","top"});
	
	System.out.println(result);
	}
	

}

package com.sb.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.sb.beans.EnggCource;

public class ClientApp {

	public static void main(String[] args) {

	
	FileSystemResource res = new FileSystemResource("src/com/sb/cfgs/applicationContext.xml");
	
	BeanFactory factory = new XmlBeanFactory(res);
	
	
     EnggCource engg = factory.getBean("it",EnggCource.class);
	 System.out.println(engg);
	
	
	 EnggCource engg1 = factory.getBean("com",EnggCource.class);
	 System.out.println(" ENGG:: " + engg1);
	
	
	}

}

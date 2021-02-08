package com.sb.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;

import com.sb.beans.AdharCard;

public class Test {

	public static void main(String[] args) {

          DefaultListableBeanFactory factory= null;
          factory = new DefaultListableBeanFactory();
          
         XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
         
         
          reader.loadBeanDefinitions("com/sb/cfgs/applicationContext.xml");
          
          
         AdharCard card  =  factory.getBean("adhar",AdharCard.class);
		
         System.out.println("card " +card);
         
       
	}
}

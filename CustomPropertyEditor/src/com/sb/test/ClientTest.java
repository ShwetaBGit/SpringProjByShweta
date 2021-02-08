package com.sb.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.CustomEditorConfigurer;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.beans.propertyeditors.PropertiesEditor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

import com.sb.beans.IntrAmtCalculator;
import com.sb.beans.IntrAmtDetails;

public class ClientTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DefaultListableBeanFactory factory = null;
		XmlBeanDefinitionReader reader = null;
		CustomEditorConfigurer conf = null;

		factory = new DefaultListableBeanFactory();

		reader = new XmlBeanDefinitionReader(factory);

		reader.loadBeanDefinitions("com/sb/cfgs/applicationContext.xml");
		conf = factory.getBean("custom",CustomEditorConfigurer.class);
		conf.postProcessBeanFactory(factory);

		IntrAmtCalculator detail = factory.getBean("iac", IntrAmtCalculator.class);

		float amount = detail.calCalAmt();
		System.out.println(amount);

		// ApplicationContext ctx =null;
		// ctx = new
		// FileSystemXmlApplicationContext("src/com/sb/cfgs/applicationContext.xml");

		IntrAmtCalculator cal = factory.getBean("iac", IntrAmtCalculator.class);
		float amt = cal.calCalAmt();

		System.out.println("amt " + amt);
	}

}

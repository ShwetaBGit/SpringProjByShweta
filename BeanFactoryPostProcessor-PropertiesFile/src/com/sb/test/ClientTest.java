package com.sb.test;

import java.sql.SQLException;
import java.util.Scanner;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.sb.controller.CustomerController;
import com.sb.servixe.LoanServiceImplement;
import com.sb.vo.CustomerVo;

public class ClientTest {

	public static void main(String[] args) throws SQLException {

		/*
		 * FileSystemXmlApplicationContext ctx = new
		 * FileSystemXmlApplicationContext("src/com/sb/cfgs/applicationContext.xml");
		 * 
		 * CustomerController loan = ctx.getBean("controller",
		 * CustomerController.class);
		 */

		DefaultListableBeanFactory factory = null;
		BeanFactoryPostProcessor bfpp = null;

		factory = new DefaultListableBeanFactory();
        System.out.println("factory created");
		
        
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
        System.out.println("reader");
		reader.loadBeanDefinitions("com/sb/cfgs/applicationContext.xml");
		bfpp = factory.getBean("ppc",BeanFactoryPostProcessor.class);
		bfpp.postProcessBeanFactory(factory);
		
		CustomerController controller = null;

		CustomerVo vo = new CustomerVo();

		Scanner sc = new Scanner(System.in);

		System.out.println("enter id");

		vo.setCid(sc.next());

		System.out.println("enter name");
		vo.setCname(sc.next());

		System.out.println("enter rate");
		vo.setRate(sc.next());

		System.out.println("Enter Amount");
		vo.setPamt(sc.next());

		System.out.println("Enter Time");
		vo.setTime(sc.next());

		controller = factory.getBean("controller", CustomerController.class);
		System.out.println(controller.process(vo));

		// ctx.close();

	}

}

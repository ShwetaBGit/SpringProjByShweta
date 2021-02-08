package com.sb.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.sb.beans.Student;

public class Test {

	public static void main(String[] args) {

		ApplicationContext ctx = null;

		ctx = new ClassPathXmlApplicationContext("com/sb/cfgs/applicationContext.xml");
		System.out.println("ctx");

		Student stud1 = ctx.getBean("stud",Student.class);
		System.out.println("stud::: " + stud1);
	}
}

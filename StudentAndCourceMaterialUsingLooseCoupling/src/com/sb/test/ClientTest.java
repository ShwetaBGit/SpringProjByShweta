package com.sb.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.sb.beans.Student;

public class ClientTest {

	public static void main(String[] args) {

		FileSystemResource res = new FileSystemResource("src/com/sb/cfgs/applicationContext.xml");

		BeanFactory factory = new XmlBeanFactory(res);

		Student student = factory.getBean("stud", Student.class);

		String stud = student.admission(new String[] { "Spring", "corejava", "advance java" });

		System.out.println(stud);

	}

}

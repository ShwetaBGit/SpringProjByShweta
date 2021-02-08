package com.sb.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.sb.beans.Vehicle;
import com.sb.beans.Vehicle1;

public class Test {

	public static void main(String[] args) {

		FileSystemResource res = null;

		res = new FileSystemResource("src/com/sb/cfgs/applicationContext.xml");

		BeanFactory factory = new XmlBeanFactory(res);

		// Vehicle veh = factory.getBean("veh",Vehicle.class);

		// veh.move();
		// System.out.println("vehicle " +veh);

		Vehicle1 veh1 = factory.getBean("veh1", Vehicle1.class);

		veh1.start(factory);
	}

}

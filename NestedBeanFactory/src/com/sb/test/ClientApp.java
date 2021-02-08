package com.sb.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.sb.beans.BankApprover;

public class ClientApp {

	public static void main(String[] args) {

		// create parent container

		FileSystemResource res = new FileSystemResource("src/com/sb/cfgs/loan-beans.xml");
		BeanFactory pFactory = new XmlBeanFactory(res);

		FileSystemResource res1 = new FileSystemResource("src/com/sb/cfgs/approver-beans.xml");
		BeanFactory cFactory1 = new XmlBeanFactory(res1, pFactory);

		BankApprover bank = cFactory1.getBean("ba", BankApprover.class);

		System.out.println(bank.approveLoaner());
	}

}

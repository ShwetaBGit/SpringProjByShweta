package com.sb.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.core.io.FileSystemResource;

import com.sb.beans.BankApprover;
import com.sb.beans.LoanDetail;
import com.sb.config.BankApproverConfig;
import com.sb.config.LoanDetailConfig;



public class ClientApp {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext cCtx, pCtx = null;

		// parent container
		pCtx = new AnnotationConfigApplicationContext(BankApproverConfig.class);

		// child container
		cCtx = new AnnotationConfigApplicationContext(LoanDetailConfig.class);
		cCtx.setParent(pCtx);

		BankApprover bank = pCtx.getBean("ba",BankApprover.class);

		System.out.println(bank.approveLoaner());
		
		
	}

}

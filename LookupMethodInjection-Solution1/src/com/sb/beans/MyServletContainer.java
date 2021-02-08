package com.sb.beans;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class MyServletContainer implements ApplicationContextAware {

	ApplicationContext ctx;
	private String beanId;

	@Override
	public void setApplicationContext(ApplicationContext ctx) throws BeansException {
		this.ctx = ctx;
		System.out.println("MyServletContainer.setApplicationContext()");

	}

	public void setBeanId(String beanId) {
		this.beanId = beanId;
	}

	public void processData(String data) {

		RequestHandler handler = ctx.getBean(beanId, RequestHandler.class);

		String result = handler.process(data);
		System.out.println("result is  " + result);
	}

}

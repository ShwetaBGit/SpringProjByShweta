package com.sb.beans;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Vehicle implements ApplicationContextAware {

	private String beanId; //unnecessary visibility
	private ApplicationContext ctx; //unnecesary visibility

	public Vehicle() {
		System.out.println("Vehicle: 0 param constructor");
	}

	@Override
	public void setApplicationContext(ApplicationContext ctx) throws BeansException {
		// System.out.println("Vehicle.setApplicationContext()");
		this.ctx = ctx;

	}

	public void setBeanId(String beanId) {
		this.beanId = beanId;
	}

	public void entertainment() {
		System.out.println("Viechle is equipped with DVC player");
	}

	public void sounHorn() {
		System.out.println("Viechle is equipped with Skoda horn");
	}

	public void journey(String start, String end) {

		System.out.println("journey started from " + start + "to " + end);

		Engine engg = ctx.getBean(beanId,Engine.class);

		engg.start();
		System.out.println("journey ended to " + end);

		engg.stop();

	}
}

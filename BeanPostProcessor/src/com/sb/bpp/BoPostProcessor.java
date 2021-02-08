package com.sb.bpp;

import java.util.Date;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import com.sb.bo.BaseBo;

public class BoPostProcessor implements BeanPostProcessor {

	public BoPostProcessor() {
		System.out.println("BoPostProcessor.BoPostProcessor()");
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String bid) throws BeansException {
		System.out.println("before initialization");
		if (bean instanceof BaseBo) {
			System.out.println("if");
			((BaseBo) bean).setDoj(new Date());
			return bean;
		}

		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String bid) throws BeansException {

		System.out.println("BPP afterInitialization");

		return bean;
	}
}

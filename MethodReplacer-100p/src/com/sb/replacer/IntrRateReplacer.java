package com.sb.replacer;

import java.lang.reflect.Method;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.support.MethodReplacer;
import org.springframework.stereotype.Component;

@Component("irr")
public class IntrRateReplacer implements MethodReplacer {

	@Value("1.2")
	private float rate;

	public void setRate(float rate) {
		this.rate = rate;
	}

	public IntrRateReplacer() {
		System.out.println("IntrRateReplacer.IntrRateReplacer()");
	}

	@Override
	public Object reimplement(Object bean, Method method, Object[] args) throws Throwable {

		System.out.println("IntrRateReplacer.reimplement()");
		System.out.println("bean class " + bean.getClass());
		System.out.println("method name " + method.getName());
		System.out.println("method args " + Arrays.toString(args));

		if (method.getName().equals("calIntrAmt")) {
			float pamt = (float) args[0];
			float time = (float) args[1];

			return pamt * time * rate / 100.0f;
		} else
			return 0.0f;
	}

}

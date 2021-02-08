package com.sb.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class VoterCheck implements InitializingBean, DisposableBean {
	private int age;
	private String name, addrs;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddrs() {
		return addrs;
	}

	public void setAddrs(String addrs) {
		this.addrs = addrs;
	}

	@Override
	public void afterPropertiesSet() throws Exception {

		if (age == 0 || name == null)
			throw new IllegalArgumentException("age or name must be set");

	}

	@Override
	public void destroy() throws Exception {

		name = null;
		age = 0;
		addrs = null;

	}

	public String check() {

		if (age >= 18)
			return name + " you are eligible for voting";

		else
			return  name + " you are not eligible for voting";
	}

	@Override
	public String toString() {
		return "VoterCheck [age=" + age + ", name=" + name + ", addrs=" + addrs + "]";
	}

}

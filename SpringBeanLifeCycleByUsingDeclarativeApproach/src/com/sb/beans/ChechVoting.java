package com.sb.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("voter")
@Data
public class ChechVoting {

	@Value("${user.name}")
	private String name;

	@Value("${user.addrs}")
	private String addrs;

	@Value("${user.age}")
	private int age;

	@PostConstruct
	public void check() {
		if (name == null || age == 0) {
			throw new IllegalArgumentException("name or age should not empty");
		}
	}

	public String checkEligibility() {
		if (age >= 18)
			return "you are eligible for voting";

		else
			return "you r not eligible for voting";

	}

	@PreDestroy
	public void destroy() {
		age = 0;
		name = null;
		addrs = null;
	}

}

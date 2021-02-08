package com.sb.config;

import java.util.Calendar;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.sb.beans")
public class AppConfig {

	static {
		System.out.println("AppConfig.static block");
	}

	
	@Bean
	public Calendar cal1() {
		Calendar cal = null;

		cal = Calendar.getInstance();

		return cal;
	}

}

package com.sb.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("prop")
@PropertySource(value="classpath:com/sb/commons/prop.properties")

public class PropTestBeans {

	
	@Value("${user.uname}")
	 private String uname;
	 
	@Value("${user.age}")
	 private int age;
	 
	@Value("${user.addrs}")
	 private String addrs;
	 
	 
	 @Value("${os.name}")
	 private String osName;
	 
	 
	 @Value("${JAVA_HOME}")
	 private String javaHome;


	@Override
	public String toString() {
		return "PropTestBeans [uname=" + uname + ", age=" + age + ", addrs=" + addrs + ", osName=" + osName
				+ ", javaHome=" + javaHome + "]";
	}
	
	 
	 
}

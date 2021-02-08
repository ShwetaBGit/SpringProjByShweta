package com.sb.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan(basePackages={"com.sb.beans","com.sb.replacer"})
@ImportResource("classpath:com/sb/cfgs/applicationContext.xml")
public class AppConfig {

}

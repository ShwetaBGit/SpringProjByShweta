package com.sb.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.sb.beans.VoterCheck;

public class Test {

	public static void main(String[] args) {


	 FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("src/com/sb/cfgs/applicationContext.xml");
	 
	   VoterCheck voter = ctx.getBean("vc",VoterCheck.class);
	
	   System.out.println(voter.check());
	}

}

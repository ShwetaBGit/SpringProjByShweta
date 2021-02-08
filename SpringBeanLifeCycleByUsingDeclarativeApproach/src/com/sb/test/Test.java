package com.sb.test;

import org.springframework.context.support.FileSystemXmlApplicationContext;
import com.sb.beans.ChechVoting;


public class Test {

	public static void main(String[] args) {

     FileSystemXmlApplicationContext ctx=null;
     
     ctx = new FileSystemXmlApplicationContext("src/com/sb/cfgs/applicationContext.xml");
     
     ChechVoting voting = ctx.getBean("voter",ChechVoting.class);
    
     System.out.println(voting.checkEligibility());
		
	}

}

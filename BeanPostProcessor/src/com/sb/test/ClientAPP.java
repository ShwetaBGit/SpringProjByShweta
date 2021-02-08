package com.sb.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.sb.dto.CustDTO;
import com.sb.dto.StudDTO;
import com.sb.service.CustStudService;

public class ClientAPP {

	public static void main(String[] args) {

		ApplicationContext ctx = new FileSystemXmlApplicationContext("src/com/sb/cfgs/applicationContext.xml");

		CustStudService service = ctx.getBean("css",CustStudService.class);

		StudDTO sdto = new StudDTO();
		sdto.setId(101);
		sdto.setCource("java");
		sdto.setName("shweta");

		service.processStud(sdto);

		CustDTO cdto = new CustDTO();
		cdto.setId(102);
		cdto.setName("aman");
		cdto.setBillAmt(9000);
	 service.processCust(cdto);
	}

}

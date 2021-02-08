package com.sb.test;

import java.sql.SQLException;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.sb.controller.CustomerController;
import com.sb.servixe.LoanServiceImplement;
import com.sb.vo.CustomerVo;

public class ClientTest {

	public static void main(String[] args) throws SQLException {

		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("src/com/sb/cfgs/applicationContext.xml");

		CustomerController loan = ctx.getBean("controller", CustomerController.class);

		CustomerVo vo = new CustomerVo();

		Scanner sc = new Scanner(System.in);

		System.out.println("enter id");

		vo.setCid(sc.next());

		System.out.println("enter name");
		vo.setCname(sc.next());

		System.out.println("enter rate");
		vo.setRate(sc.next());

		System.out.println("Enter Amount");
		vo.setPamt(sc.next());

		System.out.println("Enter Time");
		vo.setTime(sc.next());

		System.out.println(loan.process(vo));

		ctx.close();
	
	}
	

}

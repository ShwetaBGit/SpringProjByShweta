package com.sb.controller;

import java.sql.SQLException;

import com.sb.dto.CustomerDTO;
import com.sb.servixe.LoanService;
import com.sb.vo.CustomerVo;

import lombok.Data;

@Data
public class CustomerController {

	private LoanService service;
	
	public CustomerController(LoanService service) {
		this.service = service;
	}


	public float process(CustomerVo vo) throws SQLException {

		CustomerDTO dto = new CustomerDTO();
		
		dto.setId(Integer.parseInt(vo.getCid()));
		dto.setCname(vo.getCname());
		dto.setTime(Float.parseFloat(vo.getTime()));
		dto.setRate(Float.parseFloat(vo.getRate()));
		dto.setPamt(Float.parseFloat(vo.getPamt()));

		Float interest =  service.calculate(dto);
		
		return interest;
	}

	
}

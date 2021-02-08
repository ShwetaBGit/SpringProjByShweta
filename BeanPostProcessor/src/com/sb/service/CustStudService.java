package com.sb.service;

import com.sb.bo.CustomerBO;
import com.sb.bo.StudentBO;
import com.sb.dao.StudentDAO;
import com.sb.dto.CustDTO;
import com.sb.dto.StudDTO;

public abstract class CustStudService {

	private StudentDAO dao;

	public void setDao(StudentDAO dao) {
		this.dao = dao;
	}

	// abstract method
	public abstract StudentBO getStudBO();

	public abstract CustomerBO getCustBO();

	// process student
	public String processStud(StudDTO dto) {

		System.out.println(" Processing Student  Info ");

		StudentBO sbo = getStudBO();

		sbo.setId(dto.getId());
		sbo.setName(dto.getName());
		// sbo.setCource(dto.getCource());

		System.out.println("calling dao.insert(sbo)");
		int count = dao.insertData(sbo);

		if (count == 1) {
			return "student registration succeded";
		} else {
			return "Student registration failed";
		}

	}

	// process customer

	public void processCust(CustDTO cdto) {

		System.out.println("processing customer info");
		CustomerBO cbo = getCustBO();

		cbo.setId(cdto.getId());
		cbo.setBillAmt(cdto.getBillAmt());
		cbo.setName(cdto.getName());
		// cbo.setDoj(cdto.getDoj());

		System.out.println("calling dao.insert()");
		dao.insertData(cbo);

	}

}

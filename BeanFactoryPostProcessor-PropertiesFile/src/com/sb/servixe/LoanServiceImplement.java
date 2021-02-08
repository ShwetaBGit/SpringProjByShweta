package com.sb.servixe;

import java.security.KeyStore.LoadStoreParameter;
import java.sql.SQLException;

import com.sb.bo.CustomerBO;
import com.sb.dao.LoanDAO;
import com.sb.dto.CustomerDTO;

public class LoanServiceImplement implements LoanService {

	private LoanDAO dao;
	private String osname;
	private String java_home;
	
	public LoanDAO getDao() {
		return dao;
	}

	public void setDao(LoanDAO dao) {
		this.dao = dao;
	}

	public String getOsname() {
		return osname;
	}

	public void setOsname(String osname) {
		this.osname = osname;
	}

	public String getJava_home() {
		return java_home;
	}

	public void setJava_home(String java_home) {
		this.java_home = java_home;
	}

	public CustomerBO getBo() {
		return bo;
	}

	public void setBo(CustomerBO bo) {
		this.bo = bo;
	}

	public LoanServiceImplement(LoanDAO dao) {
		this.dao = dao;
	}

	CustomerBO bo = null;

	@Override
	public float calculate(CustomerDTO dto) throws SQLException {
    System.out.println("os name:: " +osname + "javahome " +java_home);
		
		float pamt = dto.getPamt();
		float rate = dto.getRate();
		float time = dto.getTime();
		float intramt = pamt * rate * time / 100.0f;

		bo = new CustomerBO();

		bo.setId(dto.getId());
		bo.setCname(dto.getCname());
		bo.setPamt(pamt);
		bo.setIntramtl(intramt);
		bo.setRate(dto.getRate());

		int result = dao.insert(bo);

		if (result != 0) {
			System.out.println("register customer");
		} else {
			System.out.println("not register");
		}

		return intramt;
	}
}

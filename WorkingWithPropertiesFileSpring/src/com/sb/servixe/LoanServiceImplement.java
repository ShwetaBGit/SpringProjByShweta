package com.sb.servixe;

import java.security.KeyStore.LoadStoreParameter;
import java.sql.SQLException;

import com.sb.bo.CustomerBO;
import com.sb.dao.LoanDAO;
import com.sb.dto.CustomerDTO;

public class LoanServiceImplement implements LoanService {

	private LoanDAO dao;

	public LoanServiceImplement(LoanDAO dao) {
		this.dao = dao;
	}

	CustomerBO bo = null;

	@Override
	public float calculate(CustomerDTO dto) throws SQLException {

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

package com.sb.servixe;

import java.sql.SQLException;

import com.sb.dto.CustomerDTO;

public interface LoanService {

	public float calculate(CustomerDTO dto) throws SQLException;
}

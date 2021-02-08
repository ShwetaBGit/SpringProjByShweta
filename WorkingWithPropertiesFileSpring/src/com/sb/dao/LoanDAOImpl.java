package com.sb.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.sb.bo.CustomerBO;

public class LoanDAOImpl implements LoanDAO {
	private static final String INSERT_QUERY = "INSERT INTO CUSTOMER_LOANINFO VALUES(?,?,?,?,?)";
	private DataSource ds;

	public LoanDAOImpl(DataSource ds) {
		this.ds = ds;
	}

	@Override
	public int insert(CustomerBO bo) throws SQLException {

		Connection con = null;
		PreparedStatement ps = null;
		int count = 0;

		con = ds.getConnection();
		ps = con.prepareStatement(INSERT_QUERY);

		         ps.setInt(1,bo.getId());
		         ps.setString(2,bo.getCname());
		        
		         ps.setFloat(3,bo.getPamt());
		         ps.setFloat(4,bo.getIntramtl());
		        
		         ps.setFloat(5, bo.getRate());

				count = ps.executeUpdate();
		
				return count;
	}

}

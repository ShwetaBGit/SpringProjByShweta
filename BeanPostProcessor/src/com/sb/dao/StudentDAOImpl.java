package com.sb.dao;

import com.sb.bo.CustomerBO;
import com.sb.bo.StudentBO;

public class StudentDAOImpl implements StudentDAO {

	public StudentDAOImpl() {
		System.out.println("StudentDAOImpl : o param constructor");
	}

	@Override
	public int insertData(StudentBO bo) {

		System.out.println("student Data is :: ");
		System.out.println(bo.getId() + " " + bo.getName() + " " + bo.getCource() + " " + bo.getDoj());
	return 1;
	}

	@Override
	public int insertData(CustomerBO bo) {
		System.out.println(bo.getId() + " " + bo.getName() + " " + bo.getBillAmt() + " " + bo.getDoj());
	return 1;
	}

}

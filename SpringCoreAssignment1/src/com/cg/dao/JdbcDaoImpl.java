package com.cg.dao;

public class JdbcDaoImpl implements IDao {
	
	public JdbcDaoImpl() {
		System.out.println("JDBC Dao Constructor");
	}

	@Override
	public String getName() {
		return "jdbc name";
	}

}

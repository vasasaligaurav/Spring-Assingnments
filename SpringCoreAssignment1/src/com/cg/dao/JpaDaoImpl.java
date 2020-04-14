package com.cg.dao;

public class JpaDaoImpl implements IDao {
	
	public JpaDaoImpl() {
		System.out.println("jpa Dao Constructor");
	}

	@Override
	public String getName() {
		return "jpa name";
	}

}

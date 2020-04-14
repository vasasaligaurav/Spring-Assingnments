package com.cg.entity;

import java.time.LocalDate;

public class Emp {
	
	private int empId;
	private String empName;
	private double empSal;
	private LocalDate doj;
	
	public Emp(int empId, String empName, double empSal, LocalDate doj) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
		this.doj = doj;
	}

	public int getEmpId() {
		return empId;
	}

	
	public String getEmpName() {
		return empName;
	}

	public double getEmpSal() {
		return empSal;
	}

	public LocalDate getDoj() {
		return doj;
	}

	@Override
	public String toString() {
		return empId + " " + empName + " " + empSal + " " +  doj ;
	}
	

}

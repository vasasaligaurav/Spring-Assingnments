package com.cg.entity;

import java.time.LocalDate;

public class Emp {

	private int eid;
	private String ename;
	private double sal;
	private LocalDate doj;
	
	public Emp(int eid, String ename, double sal, LocalDate doj) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.sal = sal;
		this.doj = doj;
	}
	
	public int getEid() {
		return eid;
	}
	public String getEname() {
		return ename;
	}
	public double getSal() {
		return sal;
	}
	public LocalDate getDoj() {
		return doj;
	}

	@Override
	public String toString() {
		return "Emp [eid=" + eid + ", ename=" + ename + ", sal=" + sal + ", doj=" + doj + "]";
	}
}

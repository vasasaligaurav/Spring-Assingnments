package com.cg.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.service.EmpSerImpl;
import com.cg.service.IEmpSer;

public class ClientA {
	
	static ApplicationContext ctx = 
			new ClassPathXmlApplicationContext("beans.xml", "beans2.xml");

	public static void main(String[] args) {
		System.out.println("main starts");
		IEmpSer ser = ctx.getBean("myser", EmpSerImpl.class);
		System.err.println(ser.getEmployees());

	}

}

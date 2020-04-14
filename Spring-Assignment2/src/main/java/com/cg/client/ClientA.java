package com.cg.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.service.IService;
import com.cg.service.ServiceImpl;

public class ClientA {

	static ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml","beans2.xml");

	public static void main(String[] args) {
		System.out.println("main starts");
		IService service=ctx.getBean("mySer",ServiceImpl.class);
		System.out.println(service.getEmployees());
	}
}


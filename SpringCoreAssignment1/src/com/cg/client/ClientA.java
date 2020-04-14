package com.cg.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.dao.IDao;
import com.cg.service.IService;

public class ClientA {
	
	static ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");

	public static void main(String[] args) {
		System.out.println("main starts");
		IService ser = ctx.getBean( IService.class);
		System.out.println(ser.viewName());
		
		System.out.println("demand second");
		IService ser1 = ctx.getBean("myser", IService.class);
		System.out.println(ser1.viewName());
		
		System.out.println("demanding dao.....");
		IDao dao = ctx.getBean("mydao", IDao.class);
		System.out.println(dao.getName());

	}

}

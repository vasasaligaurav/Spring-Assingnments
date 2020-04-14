package com.cg.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cg.service.IService;

public class ClientA {
	
	static ApplicationContext ctx = 
			new AnnotationConfigApplicationContext(MyConfig.class);

	public static void main(String[] args) {
		System.out.println("main starts");
		IService ser = ctx.getBean("myser", IService.class);
		System.out.println(ser.viewName());
		
		System.out.println("demand second");
		IService ser1 = ctx.getBean("myser", IService.class);
		System.out.println(ser1.viewName());

	}

}

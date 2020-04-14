package com.cg.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.cg.service.IService;

public class ClientB {
	
	static BeanFactory fac;
	
	static {
		Resource res = new ClassPathResource("beans.xml");
		fac = new XmlBeanFactory(res);
	}

	public static void main(String[] args) {
		System.out.println("main starts");
		IService ser = fac.getBean("myser", IService.class);
		System.out.println(ser.viewName());
		
		System.out.println("demand second");
		IService ser1 = fac.getBean("myser", IService.class);
		System.out.println(ser1.viewName());

	}

}

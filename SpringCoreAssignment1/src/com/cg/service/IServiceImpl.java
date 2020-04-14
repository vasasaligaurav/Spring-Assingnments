package com.cg.service;

import com.cg.dao.IDao;

public class IServiceImpl implements IService {
		
	private IDao dao;
	
	public IServiceImpl() {
		System.out.println("Service Consstructor");
	}
	public IServiceImpl(IDao dao) {
		this.dao=dao;
		System.out.println("Service Consstructor");
	}
	//setter for IOC to inject the dependencies
	public void setDao(IDao dao) {
		System.out.println("Inject the dependencies");
		this.dao = dao;
	}

	@Override
	public String viewName() {
		return dao.getName();
	}

}

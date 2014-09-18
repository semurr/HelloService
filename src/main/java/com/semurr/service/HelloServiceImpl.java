package com.semurr.service;

import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import com.semurr.BO.MyClass;

@WebService
public class HelloServiceImpl implements HelloService{
	
	@Autowired
	MyClass myClass;

	public String sayHello() {
		
		return myClass.getValue();
	}	

}

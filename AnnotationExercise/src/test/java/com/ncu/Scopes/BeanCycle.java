package com.ncu.Scopes;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.stereotype.Component;

@Component
public class BeanCycle {
	
	private String name;
	
	
	

	
//	public BeanCycle() {
//	System.out.println(" Constructor of the BeanCycle");
//	}
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
		System.out.println(" setting the name ");
	}


	@PostConstruct
	public void  startmethod() {
		System.out.println(" Loading the init method ");
	}
	

//	@PreDestroy
	public void destroy() {
		System.out.println(" destroying the method ");
	}

	
	
}

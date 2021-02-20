package com.ncu.Scopes;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;


@Configuration
//@ComponentScan("com.ncu.Scopes")

public class ConfBCycle {

	
	
	@Bean
	@Scope("prototype")
	public BeanCycle createbeancycle() {
		 
		  BeanCycle beanobject= new BeanCycle();
		  beanobject.setName("Prashant");
		  System.out.println(" comming from the bean of beancycle class");
		  return beanobject;
	}
	
}

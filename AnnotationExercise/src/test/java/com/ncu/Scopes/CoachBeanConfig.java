package com.ncu.Scopes;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class CoachBeanConfig {

	
	@Bean
	@Scope("prototype")
	public Baseball createbeancycle() {
		 
		  System.out.println(" comming from the bean of beancycle class");
		  return new Baseball("Prashant");
	}
	
//	@Bean
//	public Coach ccoach() {
//		Baseball mycoach= new Baseball(happyFortune());
//		return mycoach;
//	}
//	
	
//	@Bean
//	public Coach ccoach() {
//		Baseball mycoach= new Baseball(happyFortune());
//		return mycoach;
//	}
//	
	
	@Bean
	public IFortune hapFortune() {
		return new Happyfortune();
	}
	
	
	
}

package com.ncu.Scopes;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("bcoach")
//@Scope("singleton")

public class Baseball implements Coach {

	private String name;
	
	
	
	
	public Baseball(String name) {
	
		this.name = name;
		System.out.println(" name is :-> "+name);
	}




	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "daily method from the Baseball";
	}

	
	
	
	
//	@PostConstuctor
//	public  void  startinit() {
//		System.out.println(" starting the init method ");
//	}
//	
//	@preDes
//	public void destroy() {
//		System.out.println(" calling the destroy method ");
//	}
	
	
	
	
}

package com.ncu.AnnotationExercise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component

public class A {
	
	public A() {
	System.out.println(" def constructor of Class A ");
	}
	
	
	private B b;

	
	public B getB() {
		return b;
	}
	
	@Autowired
	public void setB(@Lazy B b) {
		System.out.println(" comming from the setter method from class A ");
		this.b = b;
		
	}


	
	

}

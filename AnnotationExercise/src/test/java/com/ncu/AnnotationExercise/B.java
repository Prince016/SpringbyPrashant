package com.ncu.AnnotationExercise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



@Component
public class B {

	private A a;

	public B() {
		System.out.println(" def constructor of Class B ");
		}
	
	public A getA() {
		return a;
	}
	@Autowired
	public void setA(A a) {
		this.a = a;
		System.out.println(" Comming from the setter method From Class B");
	}
	
	
	
	
	
}

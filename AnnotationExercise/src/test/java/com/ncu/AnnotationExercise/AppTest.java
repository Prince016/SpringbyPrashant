package com.ncu.AnnotationExercise;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

public class AppTest{
	public static void main(String args[]) {
		ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(Bean.class);
         
		A aobj= context.getBean(A.class);
		
//		System.out.println(aobj.getB());
		
		
	}

}

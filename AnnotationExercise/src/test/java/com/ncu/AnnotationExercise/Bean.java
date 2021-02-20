package com.ncu.AnnotationExercise;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("com.ncu.AnnotationExercise")
public class Bean {

	@org.springframework.context.annotation.Bean
      public A aob() {
		return new A();
	}
	

	@org.springframework.context.annotation.Bean
    public B bob() {
		return new B();
	}
	
	

	
}

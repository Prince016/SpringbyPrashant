package com.ncu.Scopes;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =  new AnnotationConfigApplicationContext(CoachBeanConfig.class);
		
     Baseball baseobj = context.getBean(Baseball.class);
    //		baseobj.

	}

}

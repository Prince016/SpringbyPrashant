package com.ncu.Scopes;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =  new AnnotationConfigApplicationContext(ConfBCycle.class);
		
		BeanCycle beanobject = (BeanCycle)context.getBean(BeanCycle.class);
		
			System.out.println(beanobject +" --> " +beanobject.getName());
	
			BeanCycle beanobject2 = (BeanCycle)context.getBean(BeanCycle.class);
			beanobject2.setName("hello");
			System.out.println(beanobject2 +" --> " +beanobject2.getName());

		context.close();
		System.out.println(" System closed ");
	}
}

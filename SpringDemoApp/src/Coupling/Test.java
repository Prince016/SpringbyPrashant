package Coupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {
	public static void main(String args[]) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

		IWorker io = (IWorker) context.getBean("pob");
//        IWorker ob=Factory.getObject();
		Consumer co = new Consumer(io);
		co.call();

	}  
}





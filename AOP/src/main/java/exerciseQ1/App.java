package exerciseQ1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		
		Employee empobj = context.getBean("employee",Employee.class);
	       
		System.out.println();
		empobj.setName("Prashant");
		
		
		System.out.println(empobj.getName());
//	       System.out.println("\n -- call it again -- ");
	
	       empobj.calculateSalary();
	       
	       context.close();
	}

}

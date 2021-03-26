package excerciseQ3;



import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App{
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		
		Demo obj = context.getBean("demo",Demo.class);
	       obj.goodmethod();
		
	       context.close();
	
	}

}

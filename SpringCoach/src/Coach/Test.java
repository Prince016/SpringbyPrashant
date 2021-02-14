package Coach;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		
		
		Coach coach1obj=(Coach)context.getBean("basecoach");
		System.out.println(coach1obj.getDailyWorkout());
		System.out.println(coach1obj.getDailyFortune());
		
		}

	}



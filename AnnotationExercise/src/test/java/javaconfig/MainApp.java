package javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigApp.class);
		
		Coach coachobj= context.getBean("cricketcoach",Coach.class);
		System.out.println(coachobj.getDailyWorkout());
		
		CricketCoach ccoach=(CricketCoach)context.getBean("ccoach",CricketCoach.class);
	
		System.out.println(ccoach.display());
	}

}

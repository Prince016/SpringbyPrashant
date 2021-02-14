//package Constructor;
//
//
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//
//public class PrototypeScope {
//	ApplicationContext  context = new ClassPathXmlApplicationContext("spring.xml");
//	
//	TennisCoach coachobj1=(TennisCoach)context.getBean("tcoach2");
//	TennisCoach coachobj2=(TennisCoach)context.getBean("tcoach2");
//	
//	coachobj1.setName("prashant");
//	coachobj2.setName("hello");
//
//	System.out.println(coachobj1.getName());
//	System.out.println(coachobj2.getName());
//}

package byName;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {
public static void main(String[] args) {

	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
  Employee empobj	=(Employee)context.getBean("empobj2");
       empobj.toString();
       
   System.out.println(empobj);
  }
}

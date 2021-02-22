package javaEmploye;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
//@ComponentScan("javaEmploye")
public class ConfigApp {

	
	@Bean
	public Address addobj() {
		return new Address("delhi");
	}
	
	
	
	@Bean
	public Employee empobj() {
		
		
		return new Employee(addobj());
	}
	
	
	
	
}

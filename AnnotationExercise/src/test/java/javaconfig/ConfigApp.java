package javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan("javaconfig")
public class ConfigApp {
	
	
	@Bean
	public IFortune fortobj() {
		return new Fortune();
	}
	
	
	@Bean
	public  Coach cricketcoach() {
		return new CricketCoach(fortobj());
	}

	@Bean
	public  CricketCoach ccoach() {
		return new CricketCoach(fortobj());
	}
	        
	
	
}

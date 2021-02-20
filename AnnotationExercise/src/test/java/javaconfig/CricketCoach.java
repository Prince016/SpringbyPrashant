package javaconfig;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

	private IFortune fortune;
	
	
	public CricketCoach(IFortune fortune) {
		// TODO Auto-generated constructor stub
	 this.fortune=fortune;
	}
	
	
	@Override
	public String getDailyWorkout() {
		
		return "  do daily workout ";
	}
	
	
	public String  display() {
		return fortune.getFortune();
	}

}

package javaEmploye;

import org.springframework.stereotype.Component;

@Component
public class Address {

	private String location;

	
	
	
	
	public Address(String location) {
		
		this.location = location;
		System.out.println("location is :-> "+location);
	}

	
	
	
	
	
}


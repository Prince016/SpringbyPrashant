package com.ncu.Scopes;


import org.springframework.stereotype.Component;

@Component
public class Fortune implements IFortune {
	
	public String getFortune() {
		return " Comming from the get fortune from the fortune class";
	}

}

package com.ncu.validations;



import java.util.Arrays;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PasswordCodeConstraintValidation 
implements ConstraintValidator<PasswordCode, String> {
//	private String[] coursePrefixes;
	
	
	@Override
	public void initialize(PasswordCode theCourseCode) {
//		// TODO Auto-generated method stub
//		coursePrefixes = theCourseCode.value();
//		System.out.println(coursePrefixes);
	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		// TODO Auto-generated method stub
		
	
		  return value!=null && value.matches("(?=.*[0-9]).+")  && value.matches("(?=.*[a-z]).+") && value.matches("(?=.*[A-Z]).+") 
				  && (value.length() > 8) 
				  && value.matches(".*[@#$]{1,}.*")
				  ;	
  }	
	
}  
		
		


package com.ncu.validations;



import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidations 
implements ConstraintValidator<CourseCode, String> {
	private String[] coursePrefixes;
	
	
	@Override
	public void initialize(CourseCode theCourseCode) {
		// TODO Auto-generated method stub
		coursePrefixes = theCourseCode.value();
		System.out.println(coursePrefixes);
	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		// TODO Auto-generated method stub
		
		
		boolean result=false;
		if(value!=null) {
			for(String tempPrefix : coursePrefixes) {
				result=value.startsWith(tempPrefix);
//				result=value.contains(tempPrefix);
				if(result) {
					break;
				}
			}
		 }
		else {
			result=true;
		}
		
	return result;		
		
	}
}
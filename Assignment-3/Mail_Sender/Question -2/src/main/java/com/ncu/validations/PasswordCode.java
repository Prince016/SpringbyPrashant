package com.ncu.validations;

import java.lang.annotation.Target;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.groups.Default;

@Documented
@Constraint(validatedBy = PasswordCodeConstraintValidation.class)
@Target({ElementType.METHOD,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface PasswordCode {

	// define default course code

	
	// define default error message
	public String message() default "Password must contain  at least one   digit,  one lowercase letter ,  one uppercase letter, one special character , minimum length must be 8";
	
	// define default groups
	public Class<?>[] groups() default {};
	
	// define default payloads
	public Class<? extends Payload>[] payload() default {};
}
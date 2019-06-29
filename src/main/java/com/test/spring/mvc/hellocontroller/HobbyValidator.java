package com.test.spring.mvc.hellocontroller;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class HobbyValidator implements ConstraintValidator< IsValidHobby, String > {

	
	private String listOfValidHobbies;
	
	@Override
	public void initialize(IsValidHobby isValidHobby) {
		this.listOfValidHobbies = isValidHobby.listOfValidHobbies();
		
	}

	@Override
	public boolean isValid(String hobby, ConstraintValidatorContext context) {
		if(hobby==null) {
			return false;
		}
		if(hobby.matches(listOfValidHobbies)) {
			return true;
		} 
		else
		
		
		return false;
	}



	
	

}

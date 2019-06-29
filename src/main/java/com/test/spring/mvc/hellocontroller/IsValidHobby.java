package com.test.spring.mvc.hellocontroller;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Documented
@Constraint(validatedBy=HobbyValidator.class)
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface IsValidHobby {
	
String listOfValidHobbies() default "sex|porn|fuck|music|cricket|reading";   	
	
String message() default "Please provide a valid Hobby;" +" accepted hobies are : sex,porn,fuck,music,cricket,reading";

Class<?>[]groups()default{};
Class<? extends Payload>[] payload() default{};

}
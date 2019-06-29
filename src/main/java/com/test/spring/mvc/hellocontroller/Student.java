package com.test.spring.mvc.hellocontroller;

import java.util.ArrayList;


import java.util.Date;

import javax.validation.constraints.Max;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties({"studentAdd","dob"})
@JsonPropertyOrder({"StudentName","mobile"})
public class Student {

	
	@JsonProperty("StudentName")
	@Pattern(regexp="[^0-9]*")
	private String name;
	
	//@Size(min =2,max=20)@IsValidHobby(listOfValidHobbies = "sex|porn|fuck|music|cricket|reading")
	@Size(min =2,max=20)@IsValidHobby()//will use defualt values for this Valid annoation
	private String hobby;
	
	@Max(2222)
	private Long mobile;
	
	@Past
	private Date dob;
	private Address studentAdd;
	
	
	public Address getStudentAdd() {
		return studentAdd;
	}

	public void setStudentAdd(Address studentAdd) {
		this.studentAdd = studentAdd;
	}

	private ArrayList<String> skills;

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public Long getMobile() {
		return mobile;
	}

	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}

	public ArrayList<String> getSkills() {
		return skills;
	}

	public void setSkills(ArrayList<String> skills) {
		this.skills = skills;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

}

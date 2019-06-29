package com.test.basic;

import java.util.List;

public class Department {
	private int id;
	private String name;
	private Course course;
	

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	Department(int id ,String name,Course course){
		this.id =id;
		this.name = name;
		this.course = course;
				
	}

	@Override
	public String toString(){
		return "[Dept id " +id + "Name " +name + "courseName " + course+ "]";
		}
	


}

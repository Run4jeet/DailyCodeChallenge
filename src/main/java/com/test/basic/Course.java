package com.test.basic;


class Course{
	String courseName;
	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	Course(String courseName){
		this.courseName=courseName;
	}
	
	@Override
	public String toString(){
		return "[Course Name " +courseName +"]";
		}

	
}

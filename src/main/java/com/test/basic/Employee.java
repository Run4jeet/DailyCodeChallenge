package com.test.basic;

import java.util.List;

public class Employee {
	
	private int id;
	private String name;
	private List<Department> dept;

	


	public List<Department> getDept() {
		return dept;
	}

	public void setDept(List<Department> dept) {
		this.dept = dept;
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

	Employee(int id ,String name ,List<Department> dept){
		this.id =id;
		this.name = name;
		this.dept = dept;
	}
	
	@Override
	public String toString(){
		return "[EMP id " +id + " Name " +name +" dept "+dept;
		}
	

}

package com.test.spring;

import java.util.List;

public class HelloWorld {
	private String name;
	private int age;
	private List<Address> add;

	HelloWorld(String name,int age,List<Address> add){
		this.name =name;
		 this.age = age;
		 this.add= add;
	}
	
	public void printHello() {
		System.out.println("Hello ! " + name +" " +age +" " +add);
	}

}
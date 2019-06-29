package com.test.basic;

import java.util.ArrayList;
import java.util.List;

public class TestStaticVariable {

	 int i=10;
	 
	public static void main(String[] args) {
		TestStaticVariable test = new TestStaticVariable();
		int j=10;
	 List list = new ArrayList<String>();
		list.add("a");
		list.add("a");
		
		System.out.println("ilst "+ list);
		
		//System.out.println(j);
		//System.out.println(test.sayHello());
		
	}
	public  static String sayHello() {
		
		return "Ranjeet kartikey";
	}

}

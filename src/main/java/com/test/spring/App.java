package com.test.spring;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class App {
	public static void main(String[] args) {
		
		  ApplicationContext context = new ClassPathXmlApplicationContext(  "Spring.xml");
		  HelloWorld obj = (HelloWorld) context.getBean("helloBean"); 
		  obj.printHello();
	}
}
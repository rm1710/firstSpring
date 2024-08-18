package com.Springrm.collection;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

public class App {
	public static void main(String args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/Springrm/collection");
		
		Student st = context.getBean("st1",Student.class);
		
		System.out.println(st);
		
	}
}

package com.Springrm.primitive;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
	public static void main(String[] args) {
	
		ApplicationContext context= new ClassPathXmlApplicationContext("com/Springrm/primitive/config.xml");
	
	}
}

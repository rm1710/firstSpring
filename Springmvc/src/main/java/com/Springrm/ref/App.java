package com.Springrm.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String a[]) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/Springrm/ref/config.xml");
		Student st=context.getBean("ad",Student.class);
		
		System.out.println(st.getName());
		System.out.println(st.getAddress().getCity());
		
	}
}

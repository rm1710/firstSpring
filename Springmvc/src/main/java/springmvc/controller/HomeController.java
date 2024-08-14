package springmvc.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

@Controller
public class HomeController {
	public static void main(String arg[]) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("com/becoder/web.xml");
		System.out.println(context);
	}
	
}

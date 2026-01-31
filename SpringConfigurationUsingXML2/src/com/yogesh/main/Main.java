package com.yogesh.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		String configLocation = "/com/yogesh/resources/applicationContext.xml";
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(configLocation);
		
		new Use1(applicationContext);
		
		System.out.println("\n+++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
		
		new Use2(applicationContext);
		
	}
	
}

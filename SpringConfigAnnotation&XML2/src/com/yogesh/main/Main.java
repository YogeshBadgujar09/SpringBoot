package com.yogesh.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yogesh.bean.StudentBean;

public class Main {
	
	public static void main(String[] args) {
		
		String configLocation = "/com/yogesh/resources/applicationContext.xml";
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(configLocation);
		
		StudentBean studentBean = applicationContext.getBean(StudentBean.class);
		
		studentBean.setId(1);
		studentBean.setName("Yogesh");
		studentBean.setCourse("MCA");
		
		System.out.println(studentBean.toString());
		
		
		//check Beans scope --- Singleton 
		StudentBean studentBean2 = applicationContext.getBean(StudentBean.class);
		System.out.println(studentBean2.toString());
	}
}

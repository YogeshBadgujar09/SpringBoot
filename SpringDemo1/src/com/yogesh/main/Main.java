package com.yogesh.main;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yogesh.beans.Student;
import com.yogesh.beans.Teacher;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("hello world ... !!");
		
		String configPath = "/com/yogesh/resources/applicationContext.xml";
		
		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext(configPath);
		
		
//		Student student = new Student();
//		student.setRollNo(1);
//		student.setName("Yogesh");
//		student.setFees(10000);
//		
//		System.out.println(student.toString());
		
		
		Student student = (Student) applicationContext.getBean("student");
		System.out.println(student.toString());
		
		System.out.println("=====================================================================");
		
		Student student2 = (Student) applicationContext.getBean("student");
		student2.setRollNo(101);
		student2.setName("Yogesh Badgujar");
		student2.setFees(10000);
		
		System.out.println(student2.toString());
		
		System.out.println("=====================================================================");
		
		
		System.out.println("\n\n\n +++++ Teacher Info +++++");
		Teacher teacher = (Teacher) applicationContext.getBean("teacher");
		System.out.println(teacher.toString());
		
		System.out.println("=====================================================================");
		
		System.out.println("\n\n\n +++++ Teacher Info +++++");
		Teacher teacher1 = (Teacher) applicationContext.getBean("teacher");
		teacher1.setId(0);
		teacher1.setName("Vishal sir");
		teacher1.setSalary(50000);
		System.out.println(teacher1.toString());
		
		applicationContext.close();
		
	}
	
}

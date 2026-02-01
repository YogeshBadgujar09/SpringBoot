package com.yogesh.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.yogesh.beans.Student;
import com.yogesh.resources.SpringConfiguration;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		
		Student student = applicationContext.getBean(Student.class);
		student.setRollNo(1);
		student.setName("Rohit");
		student.setCourse("BCA");
		
		System.out.println(student.toString());
		
		Student student2 =  applicationContext.getBean(Student.class);
		student2.setRollNo(2);
		student2.setName("Yogesh");
		student2.setCourse("MCA");
		
		System.out.println(student2.toString());
		
	}
}

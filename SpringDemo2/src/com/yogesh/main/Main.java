package com.yogesh.main;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.yogesh.beans.Student;
import com.yogesh.resources.SpringConfigurationFile;

public class Main {

	public static void main(String[] args) {
		
		
		ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfigurationFile.class);
		
		//Access using Class name
		Student student = applicationContext.getBean(Student.class);
		student.setRollNo(1);
		student.setName("Yogesh Badgjar");
		student.setFees(10000);
		System.out.println("Get Info :" + student.toString());
		
		//Access using bean name
		Student student2 = (Student) applicationContext.getBean("myStudentObj");
		student2.setRollNo(2);
		student2.setName("Lalit Patil");
		student2.setFees(5000);
		System.out.println("Get Info :" + student2.toString());
		
	}

}

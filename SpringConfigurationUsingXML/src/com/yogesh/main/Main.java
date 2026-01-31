package com.yogesh.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yogesh.beans.StudentInfo;

public class Main {

	public static void main(String[] args) {
		
//		StudentInfo studentInfo = new StudentInfo();
//		
//		studentInfo.setStudentRollNo(1);
//		studentInfo.setStudentName("Yogesh Badgujar");
//		studentInfo.setStudentEmail("yogeshsb18@gmail.com");
//		studentInfo.setStudentMobileNo("9770300812");
//		studentInfo.setStudentAddress("Waitakwadi, Khetia");
//		
//		System.out.println(studentInfo.toString());
		
		String configLocation = "/com/yogesh/resources/applicationContext.xml";
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(configLocation);
		
		StudentInfo studentInfo2 = applicationContext.getBean(StudentInfo.class);
		studentInfo2.setStudentRollNo(2);
		studentInfo2.setStudentName("Rohit");
		studentInfo2.setStudentEmail("rohit18@gmail.com");
		studentInfo2.setStudentMobileNo("00000");
		studentInfo2.setStudentAddress("Khetia");
		
		System.out.println(studentInfo2.toString());
		
		StudentInfo studentInfo3 = applicationContext.getBean(StudentInfo.class);
		System.out.println(studentInfo3.toString());
		
	}
	
}

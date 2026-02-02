package com.yogesh.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.yogesh.beans.EmployeeInfo;
import com.yogesh.resources.SpringConfig;

public class Main {
	
	public static void main(String[] args) {
		
//		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
		
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
		
		EmployeeInfo employeeInfo = applicationContext.getBean(EmployeeInfo.class);
		employeeInfo.seteId(0);
		employeeInfo.seteName("Ravin");
		employeeInfo.setAge(22);
		
		System.out.println("Data in department Before Set :" + employeeInfo.getDepartmentInfo().toString());
		
		employeeInfo.getDepartmentInfo().setDepartId(501);
		employeeInfo.getDepartmentInfo().setDepartName("computer scince");
		
		System.out.println("Data in Student and Department after set " + employeeInfo.toString());
		
		applicationContext.close();
	}

}

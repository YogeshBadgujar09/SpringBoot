package com.yogesh.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yogesh.beans.EmployeeBean;

public class Main {

	public static void main(String[] args) {
		
		String configLocation = "/com/yogesh/resources/applicationContext.xml" ;
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(configLocation);
		
		EmployeeBean employeeBean = applicationContext.getBean(EmployeeBean.class);
		employeeBean.seteId("E001");
		employeeBean.seteName("Rahul Choudhary");
		employeeBean.seteDepartment("Computer Science");
		employeeBean.seteSalary("90000");
		
		System.out.println(employeeBean.toString());
		
		EmployeeBean employeeBean2 = applicationContext.getBean(EmployeeBean.class);
		System.out.println(employeeBean2.toString());

		employeeBean2.seteId("E002");
		
		System.out.println(employeeBean2.toString());
		
		System.out.println("Is employeeBean == employeeBean2 ?");
		System.out.println(employeeBean == employeeBean2);
	}

}

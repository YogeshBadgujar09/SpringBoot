package com.yogesh.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.yogesh.bean.EmployeeBean;
import com.yogesh.resources.SpringConfiguration;

public class Main {
	
	public static void main(String args[]) {
		
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		
		EmployeeBean employeeBean = applicationContext.getBean(EmployeeBean.class);
		
		employeeBean.seteId(1);
		employeeBean.seteName("Rahul");
		employeeBean.seteSalary(50000);
		
		System.out.println(employeeBean.toString());
		
	}

}

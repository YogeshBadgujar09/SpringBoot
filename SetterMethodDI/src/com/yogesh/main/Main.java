package com.yogesh.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.yogesh.beans.AddressBean;
import com.yogesh.beans.StudentBean;
import com.yogesh.resources.SpringConfig;

public class Main {
	
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
		
		StudentBean studentBean = applicationContext.getBean(StudentBean.class);
		studentBean.setRollNo(1);
		studentBean.setName("Rahul");
		
		AddressBean addressBean = studentBean.getAddressBean();
		addressBean.setCity("Barwani");
		addressBean.setPincode(451881);
		
		
		System.out.println(studentBean.toString());
		
	}
	
}

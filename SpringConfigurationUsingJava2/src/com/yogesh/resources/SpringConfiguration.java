package com.yogesh.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.yogesh.bean.EmployeeBean;

@Configuration
public class SpringConfiguration {
	
	@Bean
	public EmployeeBean createEmployeeObject() {
		
		EmployeeBean employeeBean = new EmployeeBean();
		return employeeBean ;
	}
		
}

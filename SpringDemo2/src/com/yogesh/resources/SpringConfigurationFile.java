package com.yogesh.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.yogesh.beans.Student;

@Configuration
public class SpringConfigurationFile {
	
	@Bean("myStudentObj")
	public Student createStudentObject() {
		
		Student student = new Student();
		return null;
	}
}

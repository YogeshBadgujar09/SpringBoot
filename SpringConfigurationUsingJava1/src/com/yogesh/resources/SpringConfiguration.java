package com.yogesh.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.yogesh.beans.Student;

@Configuration
public class SpringConfiguration {
	
	@Bean
	public Student createStudentObject() {
		Student student = new Student();
		return student;
	}

}

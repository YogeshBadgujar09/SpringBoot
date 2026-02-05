package com.yogesh.bean;

import org.springframework.stereotype.Component;

@Component
public class StudentBean {
		
	private int id;
	private String name ;
	private String course ;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "StudentBean [id=" + id + ", name=" + name + ", course=" + course + "]";
	}
	
	
	
}

package com.yogesh.model;

public class StudentModel {

	private int rollNo;
	private String name ;
	private String course ;
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
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
		return "StudentModel [rollNo=" + rollNo + ", name=" + name + ", course=" + course + "]";
	}
		
}

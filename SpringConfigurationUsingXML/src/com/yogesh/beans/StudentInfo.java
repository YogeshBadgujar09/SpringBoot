package com.yogesh.beans;

public class StudentInfo {
	
	private int studentRollNo ;
	private String studentName ;
	private String studentEmail ;
	private String studentMobileNo ;
	private String studentAddress ;
	
	public int getStudentRollNo() {
		return studentRollNo;
	}
	
	public void setStudentRollNo(int studentRollNo) {
		this.studentRollNo = studentRollNo;
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public String getStudentEmail() {
		return studentEmail;
	}
	
	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}
	
	public String getStudentMobileNo() {
		return studentMobileNo;
	}
	
	public void setStudentMobileNo(String studentMobileNo) {
		this.studentMobileNo = studentMobileNo;
	}
	
	public String getStudentAddress() {
		return studentAddress;
	}
	
	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}

	@Override
	public String toString() {
		return "StudentInfo [studentRollNo=" + studentRollNo + ", studentName=" + studentName + ", studentEmail="
				+ studentEmail + ", studentMobileNo=" + studentMobileNo + ", studentAddress=" + studentAddress + "]";
	}
	
}

package com.company.model;

public class EmployeeModel {
	
	private int employeeId ;
	private String employeeName ;
	private String employeeMobile ;
	private String dobOfJoin ;
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeMobile() {
		return employeeMobile;
	}
	public void setEmployeeMobile(String employeeMobile) {
		this.employeeMobile = employeeMobile;
	}
	public String getDobOfJoin() {
		return dobOfJoin;
	}
	public void setDobOfJoin(String dobOfJoin) {
		this.dobOfJoin = dobOfJoin;
	}
	
	@Override
	public String toString() {
		return "EmployeeModel [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeMobile="
				+ employeeMobile + ", dobOfJoin=" + dobOfJoin + "]";
	}
	
	
	
}

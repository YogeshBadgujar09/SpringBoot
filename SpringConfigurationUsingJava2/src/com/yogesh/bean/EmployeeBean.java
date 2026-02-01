package com.yogesh.bean;

public class EmployeeBean {
	
	private int eId ;
	private String eName ;
	private double eSalary ;
	
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public double geteSalary() {
		return eSalary;
	}
	public void seteSalary(double eSalary) {
		this.eSalary = eSalary;
	}
	
	
	@Override
	public String toString() {
		return "EmployeeBean [eId=" + eId + ", eName=" + eName + ", eSalary=" + eSalary + "]";
	}
	
	
		
}

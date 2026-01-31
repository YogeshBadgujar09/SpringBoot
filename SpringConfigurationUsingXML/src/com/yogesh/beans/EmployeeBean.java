package com.yogesh.beans;

public class EmployeeBean {
		
	private String eId;
	private String eName;
	private String eDepartment;
	private String eSalary;
	
	public String geteId() {
		return eId;
	}
	public void seteId(String eId) {
		this.eId = eId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String geteDepartment() {
		return eDepartment;
	}
	public void seteDepartment(String eDepartment) {
		this.eDepartment = eDepartment;
	}
	public String geteSalary() {
		return eSalary;
	}
	public void seteSalary(String eSalary) {
		this.eSalary = eSalary;
	}
	
	@Override
	public String toString() {
		return "EmployeeBean [eId=" + eId + ", eName=" + eName + ", eDepartment=" + eDepartment + ", eSalary=" + eSalary
				+ "]";
	}
	
	
			
}

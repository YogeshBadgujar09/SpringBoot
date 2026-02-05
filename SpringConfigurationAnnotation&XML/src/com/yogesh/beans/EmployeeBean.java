package com.yogesh.beans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class EmployeeBean {
	
	private int eId ;
	private String eName ;
	private String eSalary ;
	
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
	public String geteSalary() {
		return eSalary;
	}
	public void seteSalary(String eSalary) {
		this.eSalary = eSalary;
	}
	
	@Override
	public String toString() {
		return "EmployeeBean [eId=" + eId + ", eName=" + eName + ", eSalary=" + eSalary + "]";
	}
	
	
}

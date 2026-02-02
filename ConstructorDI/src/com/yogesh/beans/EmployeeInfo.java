package com.yogesh.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeInfo {
	
	private int eId ;
	private String eName ;
	private int age ;

	private DepartmentInfo departmentInfo ;
	
	public EmployeeInfo() {
		
	}
	
	@Autowired
	public EmployeeInfo(DepartmentInfo departmentInfo) {
		super();
		this.departmentInfo = departmentInfo;
	}
	
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public DepartmentInfo getDepartmentInfo() {
		return departmentInfo;
	}

	public void setDepartmentInfo(DepartmentInfo departmentInfo) {
		this.departmentInfo = departmentInfo;
	}

	@Override
	public String toString() {
		return "EmployeeInfo [eId=" + eId + ", eName=" + eName + ", age=" + age + ", "
				+ "departmentInfo=" + departmentInfo.toString()	+ "]";
	}
	
}

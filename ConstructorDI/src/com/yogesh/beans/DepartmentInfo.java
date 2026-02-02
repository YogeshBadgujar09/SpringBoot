package com.yogesh.beans;

import org.springframework.stereotype.Component;

@Component
public class DepartmentInfo {
	
	private int departId ;
	private String departName ;
	
	public int getDepartId() {
		return departId;
	}
	public void setDepartId(int departId) {
		this.departId = departId;
	}
	public String getDepartName() {
		return departName;
	}
	public void setDepartName(String departName) {
		this.departName = departName;
	}
	
	@Override
	public String toString() {
		return "DepartmentInfo [departId=" + departId + ", departName=" + departName + "]";
	}
}

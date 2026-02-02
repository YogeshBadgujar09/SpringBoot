package com.yogesh.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StudentBean {
	
	private int rollNo ;
	private String name ;
	@Autowired
	private AddressBean addressBean ;
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
	public AddressBean getAddressBean() {
		return addressBean;
	}
	public void setAddressBean(AddressBean addressBean) {
		this.addressBean = addressBean;
	}
	@Override
	public String toString() {
		return "StudentBean [rollNo=" + rollNo + ", name=" + name + ", addressBean=" + addressBean.toString() + "]";
	}
	
}

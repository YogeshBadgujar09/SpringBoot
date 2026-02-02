package com.yogesh.beans;

import org.springframework.stereotype.Component;

@Component
public class AddressBean {

	private String city ;
	private long pincode ;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public long getPincode() {
		return pincode;
	}
	public void setPincode(long pincode) {
		this.pincode = pincode;
	}
	
	@Override
	public String toString() {
		return "AddressBean [city=" + city + ", pincode=" + pincode + "]";
	}
		
}

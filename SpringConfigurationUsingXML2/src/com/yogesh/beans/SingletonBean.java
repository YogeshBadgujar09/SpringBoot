package com.yogesh.beans;

import org.springframework.cglib.transform.impl.AddDelegateTransformer;

public class SingletonBean {
	
	public int add(int a, int b) {
		return a + b;
	}
	
}

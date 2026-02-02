package com.yogesh.solutiondi;

public class Car {
	
	private Engine engine;
	
	public Car() {
		// TODO Auto-generated constructor stub
	}

	public Car(Engine engine) {
		super();
		this.engine = engine;
	}	
	
	public void startCar() {
		
		engine.start();
		System.out.println("Car started ... !!!");
	}
}

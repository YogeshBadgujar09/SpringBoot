package com.yogesh.problemunderstanding;
public class Car {
	
	private Engine engine;
	
	public void startCar() {
		
		engine = new Engine();
		 
		engine.engineStart();
		System.out.println("Car Started ... !!!");
	}
	
}

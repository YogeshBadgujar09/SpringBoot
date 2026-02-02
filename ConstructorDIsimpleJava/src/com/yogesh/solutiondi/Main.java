package com.yogesh.solutiondi;

public class Main {
		
	public static void main(String[] args) {
		
		Engine engine = new ElectricEngine();
		
		Car car = new Car(engine);
		car.startCar();
		
		
	}
}

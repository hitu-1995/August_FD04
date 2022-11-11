package com.cjc.model;
public class Car {
	public Car() {
		System.out.println("Car  :: Constructor");
	}
	private Engine engine;   // null
	public Car(Engine engine) {
		this.engine = engine;
	}
	public void drive() {
		if (engine != null) {
			int status = engine.start();
			System.out.println("Car is Started !!!");
		} else {
			System.out.println("Car is not started because Engine has Problem");
		}
	}
}

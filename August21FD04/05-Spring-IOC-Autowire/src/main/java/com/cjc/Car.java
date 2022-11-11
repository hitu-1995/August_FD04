package com.cjc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
public class Car {


	private Engine engine;

	@Autowired
	@Qualifier("engine2")
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public Engine getEngine() {
		return engine;
	}
	public void startCar() {
		if(engine!=null) {
			System.out.println(engine.hashCode());
			boolean status = engine.startEngine();
			System.out.println("Engine is started");
			System.out.println("Car is going forward");
		}
		else {
			System.out.println("Car is Stopped");
		}
	}
}

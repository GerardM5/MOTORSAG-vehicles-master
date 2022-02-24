package com.vehicles.project;

import java.util.ArrayList;
import java.util.List;

public class Bike extends Vehicle {

	public Bike(String plate, String brand, String color) throws Exception {
		super(plate, brand, color);
		frontWheelsRequired = 1;
		backWheelsRequired = 1;
	}


	public void addWheels(List<Wheel> frontWheels, List<Wheel> backWheels) throws Exception {
		addOneWheel(frontWheels);
		addOneWheel(backWheels);
	}


	public void addOneWheel(List<Wheel> wheels) throws Exception {
		if (wheels.size() != 1) throw new Exception("Necesita 1 rueda, ni mas ni menos.");

		this.wheels.add(wheels.get(0));
	}

}

package com.vehicles.project;

import java.util.Objects;


public class Wheel {

	public static final double MIN_DIAMETER = 0.4;
	public static final double MAX_DIAMETER = 4;

	private String brand;
	private double diameter;

	public Wheel(String brand, double diameter) throws Exception {
		checkDiameter(diameter);
		checkBrand(brand);
		this.brand = brand;
		this.diameter = diameter;
	}

	private void checkBrand(String brand) throws Exception {
		if(brand==null || brand.equals("")) throw new Exception();
	}

	private void checkDiameter(double diameter) throws Exception {
		if(diameter<MIN_DIAMETER || diameter>MAX_DIAMETER) throw new Exception();
	}



	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Wheel wheel = (Wheel) o;
		return Double.compare(wheel.diameter, diameter) == 0 && Objects.equals(brand, wheel.brand);
	}

	@Override
	public int hashCode() {
		return Objects.hash(brand, diameter);
	}



}

package com.vehicles.project;

import java.util.ArrayList;
import java.util.List;

public class Tricycle extends Vehicle {
    public Tricycle(String plate, String brand, String color) throws Exception {
        super(plate, brand, color);
        frontWheelsRequired = 1;
        backWheelsRequired = 2;
    }

    @Override
    public void addWheels(List<Wheel> frontWheels, List<Wheel> backWheels) throws Exception {
        addOneWheel(frontWheels);
        addTwoWheels(backWheels);
    }

    public void addOneWheel(List<Wheel> wheels) throws Exception {
        if (wheels.size() != 1) throw new Exception("Necesita 1 rueda, ni mas ni menos.");

        this.wheels.add(wheels.get(0));
    }
    public void addTwoWheels(List<Wheel> wheels) throws Exception {
        if (wheels.size() != 2)
            throw new Exception("Tiene que tener 2 ruedas exactamente");

        Wheel rightWheel = wheels.get(0);
        Wheel leftWheel = wheels.get(1);

        if (!rightWheel.equals(leftWheel))
            throw new Exception("Ruedas diferentes");

        this.wheels.add(leftWheel);
        this.wheels.add(rightWheel);
    }

}

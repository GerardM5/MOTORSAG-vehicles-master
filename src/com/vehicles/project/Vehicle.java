package com.vehicles.project;

import java.util.ArrayList;
import java.util.List;

public abstract class Vehicle {

    protected String plate;
    protected String brand;
    protected String color;
    protected List<Wheel> wheels = new ArrayList<>();
    protected int frontWheelsRequired;
    protected int backWheelsRequired;

    public Vehicle(String plate, String brand, String color) throws Exception {
        checkPlate(plate);
        checkBrand(brand);
        checkColor(color);
        this.plate = plate;
        this.brand = brand;
        this.color = color;
    }

    private void checkColor(String color) throws Exception {
        if(color==null || color.equals("")) throw new Exception();
    }

    private void checkBrand(String brand) throws Exception {
        if(brand==null || brand.equals("")) throw new Exception();

    }

    private void checkPlate(String plate) throws Exception {
        if (!plate.toUpperCase().matches(("^[0-9]{4}[A-Z]{3}$"))) {
            throw new Exception();
        }
    }
    public abstract void addWheels(List<Wheel> frontWheels, List<Wheel> backWheels) throws Exception;


}

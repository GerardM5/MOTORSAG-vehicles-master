package com.vehicles.project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static final String CAR = "Car";
    public static final String BIKE = "Bike";
    private static final String TRICYCLE = "Tricycle";

    public static void main(String[] args) {

        try {
            String vehicle = chooseVehicleType();
            Vehicle vehicle1 = createVehicle(vehicle);
            addWheelsToVehicle(vehicle1);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }


    }

    private static void addWheelsToVehicle(Vehicle vehicle1) throws Exception {
        System.out.println("Creación de ruedas: ");
        List<Wheel>frontWheels = new ArrayList<>();
        for (int i=0; i< vehicle1.frontWheelsRequired;i++){
            frontWheels.add(createWheel());
        }
        List<Wheel>backWheels = new ArrayList<>();
        for (int i=0; i< vehicle1.backWheelsRequired;i++){
            backWheels.add(createWheel());
        }

        vehicle1.addWheels(frontWheels, backWheels);

    }

    private static Vehicle createVehicle(String vehicle) throws Exception {

        if (vehicle.equalsIgnoreCase(CAR)) return createCar();
        if (vehicle.equalsIgnoreCase(BIKE)) return createBike();
        if(vehicle.equalsIgnoreCase(TRICYCLE)) return createTricycle();
        throw new Exception("Vehiculo incorrecto");
    }

    private static Vehicle createTricycle() throws Exception {
        System.out.println("Dime los datos del triciclo");
        return new Tricycle(askForPlate(), askForColor(), askForBrand());
    }

    private static Vehicle createBike() throws Exception {
        System.out.println("Dime los datos de la moto");
        return new Bike(askForPlate(), askForColor(), askForBrand());
    }

    private static String chooseVehicleType() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Que vehiculo quieres crear? Bike o Car");
        return sc.next();
    }



    private static Car createCar() throws Exception {
        System.out.println("Dime los datos del coche");
        return new Car(askForPlate(), askForColor(), askForBrand());
    }


    private static Wheel createWheel() throws Exception {
        return new Wheel(askForBrand(), askForDiameter());
    }

    private static double askForDiameter() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe el diametro");
        return sc.nextDouble();
    }


    private static String askForBrand() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe la marca");
        return sc.next();
    }

    private static String askForColor() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe el color");
        return sc.next();
    }

    private static String askForPlate() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe la matricula");
        return sc.next();
    }

}

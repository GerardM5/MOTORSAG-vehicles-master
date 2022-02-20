package com.vehicles.project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Car car1 = getCar();
        car1.addWheels(getWheels(), getWheels());

    }

    private static List<Wheel> getWheels() {
        List<Wheel> wheels = new ArrayList<>();
        System.out.println("Dime los datos de la rueda izquierda: ");
        wheels.add(getWheel());
        System.out.println("Dime los datos de la rueda derecha: ");
        wheels.add(getWheel());
        return wheels;
    }

    private static Car getCar() {
        System.out.println("Dime los datos del coche");
        return new Car(askForPlate(), askForColor(), askForBrand());
    }

    private static Wheel getWheel() {
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

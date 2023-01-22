package pro.sky.java.course2.Lesson4_polimorphism_geneticOOP.transport;

import pro.sky.java.course2.Lesson4_polimorphism_geneticOOP.Driver.LicenseD;

public class Bus extends Transport<LicenseD> {

    public Bus(String brand, String model, double engineVolume, LicenseD driver) {
        super(brand, model, engineVolume, driver);
    }

    public Bus(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public String toString() {
        return "Bus " + super.toString();
    }
    @Override
    public void pitStop() {
        System.out.println( "Bus went to the pit-stop, 30 seconds and go!");
    }

    @Override
    public void bestLapTime() {
        System.out.println("Bus has best time lap.");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Bus has maximal speed. ");
    }
}

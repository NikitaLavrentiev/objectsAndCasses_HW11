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
}

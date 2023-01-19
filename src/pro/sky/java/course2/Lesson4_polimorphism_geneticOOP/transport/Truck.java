package pro.sky.java.course2.Lesson4_polimorphism_geneticOOP.transport;

import pro.sky.java.course2.Lesson4_polimorphism_geneticOOP.Driver.LicenseC;
public class Truck extends Transport<LicenseC> {

    public Truck(String brand, String model, double engineVolume, LicenseC driver) {
        super(brand, model, engineVolume, driver);
    }

    public Truck(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public String toString() {
        return "Truck " + super.toString();
    }
}

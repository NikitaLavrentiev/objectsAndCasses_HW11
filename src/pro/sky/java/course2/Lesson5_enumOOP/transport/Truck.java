package pro.sky.java.course2.Lesson5_enumOOP.transport;

import pro.sky.java.course2.Lesson5_enumOOP.Driver.LicenseC;

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
    @Override
    public void pitStop() {
        System.out.println(this + " went to the pit-stop.");
    }

    @Override
    public void bestLapTime() {
        System.out.println(this + " has best time lap.");
    }

    @Override
    public void maxSpeed() {
        System.out.println(this + " has maximal speed... So much power");
    }
}

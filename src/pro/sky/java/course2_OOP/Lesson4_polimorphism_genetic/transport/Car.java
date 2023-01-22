package pro.sky.java.course2_OOP.Lesson4_polimorphism_genetic.transport;

import pro.sky.java.course2_OOP.Lesson4_polimorphism_genetic.Driver.LicenseB;

public class
Car extends Transport<LicenseB> {

    public Car(String brand, String model, double engineVolume, LicenseB driver) {
        super(brand, model, engineVolume, driver);
    }

    public Car(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public String toString() {
        return "Car " + super.toString();
    }

    @Override
    public void pitStop() {
        System.out.println(this + " went to the pit-stop.");
    }

    @Override
    public void bestLapTime() {
        System.out.println(this + " has best time lap. Can you beat it?");
    }

    @Override
    public void maxSpeed() {
        System.out.println(this + " has maximal speed. ");
    }
}
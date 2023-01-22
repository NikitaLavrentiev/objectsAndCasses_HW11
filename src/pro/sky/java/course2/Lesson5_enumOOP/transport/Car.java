package pro.sky.java.course2.Lesson5_enumOOP.transport;

import pro.sky.java.course2.Lesson5_enumOOP.Driver.LicenseB;

public class
Car extends Transport<LicenseB> {
    private BodyType[] bodyTypes = new BodyType[BodyType.values().length];
    public Car(String brand, String model, double engineVolume, LicenseB driver) {
        super(brand, model, engineVolume, driver);
    }

    public Car(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    public BodyType[] getBodyTypes() {
        return bodyTypes;
    }

    public void setBodyTypes(BodyType[] bodyTypes) {
        this.bodyTypes = bodyTypes;
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
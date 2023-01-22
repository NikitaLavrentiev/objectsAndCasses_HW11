package pro.sky.java.course2_OOP.Lesson6_exceptions.transport;

import pro.sky.java.course2_OOP.Lesson6_exceptions.Driver.LicenseB;

public class
Car extends Transport<LicenseB> {
    private final BodyType bodyTypes;
    private String type;
    public Car(String brand, String model, double engineVolume, BodyType bodyTypes, LicenseB driver) {
        super(brand, model, engineVolume, driver);
        this.bodyTypes = bodyTypes;
    }

    public Car(String brand, String model, double engineVolume, BodyType bodyTypes) {
        super(brand, model, engineVolume);
        this.bodyTypes = bodyTypes;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void printType() {
        if (getType() == null || getType().isBlank() || getType().isEmpty()) {
            System.out.println("Vehicle data is not enough");
        } else {
            System.out.println("\n" +
                    "Vehicle Type " + getType());
            System.out.println(getType());
        }
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

    public enum BodyType {
        SEDAN("Sedan"),
        HATCHBACK("Hatchback"),
        COUPE("Coupe"),
        UNIVERSAL("Universal"),
        SUV("SUV"),
        CROSSOVER("Crossover"),
        PICKUP("Pickup"),
        VAN("Van"),
        MINIVAN("Minivan");

        final String category;

        BodyType(String type) {
            this.category = type;
        }

        public String getType() {
            return category;
        }

        @Override
        public String toString() {
            return "BodyType is " + category;
        }
    }
}
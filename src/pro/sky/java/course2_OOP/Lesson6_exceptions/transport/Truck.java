package pro.sky.java.course2_OOP.Lesson6_exceptions.transport;

import pro.sky.java.course2_OOP.Lesson6_exceptions.Driver.LicenseC;

public class Truck extends Transport<LicenseC> {
    private final LoadCapacity loadCapacity;
    private String type;
    public Truck(String brand, String model, double engineVolume, LoadCapacity loadCapacity, LicenseC driver) {
        super(brand, model, engineVolume, driver);
        this.loadCapacity = loadCapacity;
    }

    public Truck(String brand, String model, double engineVolume, LoadCapacity loadCapacity) {
        super(brand, model, engineVolume);
        this.loadCapacity = loadCapacity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public LoadCapacity getLoadCapacity() {
        return loadCapacity;
    }

    @Override
    public void printType() {
        if (getType() == null || getType().isBlank() || getType().isEmpty()) {
            System.out.println("Vehicle data is not enough");
        } else {
            System.out.println("\n" +
                    "Vehicle Type" + getType());
            System.out.println(getLoadCapacity().toString());
        }
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

    public enum LoadCapacity {
        N1(Float.MIN_VALUE, 3.5f),
        N2(3.5f, 12f),
        N3(12f, Float.MAX_VALUE);


        final Float MIN;
        final Float MAX;


        LoadCapacity(float min, float max) {
            if (max > min || (max == min && min > 0)) {
                if (min < 0f) {
                    this.MIN = 0f;
                } else {
                    this.MIN = min;
                }
                this.MAX = max;
            } else {
                this.MIN = 0f;
                this.MAX = 3.5f;
            }
        }

        @Override
        public String toString() {
            if (MIN == 0f) {
                return " max load capacity " + MAX + " tonn , ";
            } else if (MIN > 0f && MAX < Float.MAX_VALUE && MAX != MIN) {
                return " load capacity " + MIN + "-" + MAX + " tonn , ";
            } else {
                return "load capacity more " + MIN + " tonn , ";
            }
        }
    }
}

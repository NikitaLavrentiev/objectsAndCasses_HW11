package pro.sky.java.course2.Lesson5_enumOOP.transport;

import pro.sky.java.course2.Lesson5_enumOOP.Driver.LicenseD;

public class Bus extends Transport<LicenseD> {
    public enum Size {
        EXTRA_SMALL(0, 10),
        SMALL(10, 25),
        LARGE(40, 50),
        ESPECIALLY_LARGE(100, 120);

        final int MIN;
        final int MAX;


        Size(int min, int max) {
            if (max > min || (max == min && min>0)) {
                if (min < 0) {
                    this.MIN = 0;
                } else {
                    this.MIN = min;
                }
                this.MAX = max;
            } else  {
                this.MIN = 0;
                this.MAX = 10;
            }
        }

        @Override
        public String toString() {
            if (MIN == 0) {
                return  " counts of sits " + MAX+ ", ";
            } else if (MIN > 0 && MAX!=MIN) {
                return " counts of sits " + MIN+"-"+ MAX + ", ";
            }else {
                return " counts of sits " + MIN+ ", ";}
        }
    }

    private final Size size;
    private String type;
    public Bus(String brand, String model, double engineVolume, Size size , LicenseD driver) {
        super(brand, model, engineVolume, driver);
        this.size = size;
    }

    public Bus(String brand, String model, double engineVolume, Size size) {
        super(brand, model, engineVolume);
        this.size = size;
    }

    public Size getSize() {
        return size;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public void printType() {
            if (getType() == null || getType().isBlank() || getType().isEmpty()) {
                System.out.println("Vehicle data is not enough");
            } else {
                System.out.println("Vehicle type " + getType());
                System.out.println(getSize().toString());
            }
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

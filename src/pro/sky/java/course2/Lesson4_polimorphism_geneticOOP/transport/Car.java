package pro.sky.java.course2.Lesson4_polimorphism_geneticOOP.transport;

import pro.sky.java.course2.Lesson4_polimorphism_geneticOOP.Driver.LicenseB;

public class Car extends Transport<LicenseB> {

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
}
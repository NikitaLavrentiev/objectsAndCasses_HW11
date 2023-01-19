package pro.sky.java.course2.Lesson4_polimorphism_geneticOOP.transport;

import java.time.LocalDate;
import java.util.Objects;

public class Car extends Transport {

    public Car(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }
}
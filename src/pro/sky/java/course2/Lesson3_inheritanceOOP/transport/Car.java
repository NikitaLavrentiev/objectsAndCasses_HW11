package pro.sky.java.course2.Lesson3_inheritanceOOP.transport;

import java.time.LocalDate;
import java.util.Objects;

public class Car {

    /*Создайте пакет transport и перенесите туда класс Car.
     Добавьте следующие свойства класса:
     «Коробка передач»,
     «Тип кузова»,
     «Регистрационный номер»,
     «Количество мест»,
     признак «Летняя» или «Зимняя резина».*/
    private String transmission;
    private int registrationNumber;
    private final int numberOfSeats;
    private final String bodyType;
    private final String brand;
    private final String model;
    private boolean isSummerTyres;
    private double engineVolume;
    private final int year;
    private String color;
    private final String country;
    private Key key;
    private static int countOfCars;
    private static final String DEFAULT_VALUE = "default";
    private static final Integer DEFAULT_VALUE_OF_SEATS = 4;
    private static final double DEFAULT_ENGINE_VALUE = 1.5;
    private static final String DEFAULT_COLOUR = "white";
    private static final String DEFAULT_TRANSMISSION = "auto";

    public Car(String brand, String model, int year, String country, String color, double engineVolume, String transmission, String bodyType, int registrationNumber, int numberOfSeats, boolean isSummerTyres, Key key) {
        setRegistrationNumber(registrationNumber); //для оптимизации, вместо условий поставил сеттеры
        setTransmission(transmission);
        setKey(key);
        setColor(color);
        setEngineVolume(engineVolume);

        if (brand.isBlank() || brand == null) {
            this.brand = DEFAULT_VALUE;
        } else {
            this.brand = brand;
        }
        if (model.isBlank() || model == null) {
            this.model = DEFAULT_VALUE;
        } else {
            this.model = model;
        }
        if (year >= 0) {
            this.year = year;
        } else {
            this.year = 2000;
        }
        if (country.isBlank() || country == null) {
            this.country = DEFAULT_VALUE;
        } else {
            this.country = country;
        }
        if (bodyType.equals("Jeep") ||
                bodyType.equals("Hatchback") || bodyType.equals("Sedan") || bodyType.equals("Coupe") ||
                bodyType.equals("Wagon") || bodyType.equals("Van") || bodyType.equals("MUV/SUV") ||
                bodyType.equals("Convertible")) {
            this.bodyType = bodyType;
        } else if (bodyType.isBlank() || bodyType == null) {
            this.bodyType = DEFAULT_VALUE;
        } else {
            this.bodyType = DEFAULT_VALUE;
        }
        if (numberOfSeats <= 0) {
            this.numberOfSeats = DEFAULT_VALUE_OF_SEATS;
        } else {
            this.numberOfSeats = numberOfSeats;
        }
        this.isSummerTyres = isSummerTyres;
        countOfCars++;
    }

    public Car(String brand, String model, double engineVolume, int year) {
        this(brand, model, year,"","", engineVolume, "",  "", 0, 0, false, new Key());
        countOfCars++;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = Objects.requireNonNullElseGet(key, Key::new);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        if (transmission.isBlank() || transmission == null) {
            this.transmission = DEFAULT_TRANSMISSION;
        } else {
            this.transmission = transmission;
        }
    }

    public int getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(int registrationNumber) {
        if (registrationNumber >= 0) {
            this.registrationNumber = registrationNumber;
        } else {
            this.registrationNumber = countOfCars;
        }
    }

    public static int getCountOfCars() {
        return countOfCars;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public String getBodyType() {
        return bodyType;
    }

    public boolean isSummerTyres() {
        return isSummerTyres;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume >= DEFAULT_ENGINE_VALUE) {
            this.engineVolume = engineVolume;
        } else {
            this.engineVolume = DEFAULT_ENGINE_VALUE;
        }
    }

    public void setColor(String color) {
        if (color.isBlank() || color == null) {
            this.color = DEFAULT_COLOUR;
        } else {
            this.color = color;
        }
    }

    public int getMonth() {
        return LocalDate.now().getMonthValue();
    }

    public void changeTiresForSeason() {
        isSummerTyres = getMonth() >= 4 && getMonth() < 12;
    }

    @Override
    public String toString() {
        return '\n' + brand + " " + model + ", production year " +year+", made in " + country + ", colour is " + color + ", engine volume " + engineVolume + " l."
                + "\nnumbers of seats is " + numberOfSeats + ", body type " + bodyType + ", registration number " + registrationNumber + ", " + "\ntransmission "
                + transmission + ", with " + (isSummerTyres? "summer tyres": "winter tyres");
    }

    public static class Key {
        private final boolean REMOTE_ENGINE_START;
        private final boolean KEYLESS_ACCESS;

        public Key(boolean remoteEngineStart, boolean keylessAccess) {
            this.REMOTE_ENGINE_START = remoteEngineStart;
            this.KEYLESS_ACCESS = keylessAccess;
        }

        public Key() {
            this(false, false);
        }

        public boolean isREMOTE_ENGINE_START() {
            return REMOTE_ENGINE_START;
        }

        public boolean isKEYLESS_ACCESS() {
            return KEYLESS_ACCESS;
        }

        @Override
        public String toString() {
            return "Key(" +
                    "remoteEngineStart=" + REMOTE_ENGINE_START +
                    ", keylessAccess=" + KEYLESS_ACCESS+
                    ')';
        }
    }
}

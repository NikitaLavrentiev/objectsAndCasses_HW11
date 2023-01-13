package pro.sky.java.course2.Lesson2_encapsulationOOP.transport;

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
    private static int countOfCars;
    private final int numberOfSeats;
    private final String bodyType;
    private final String brand;
    private final String model;
    private boolean isSummerTyres;
    private double engineVolume;
    private final int year;
    private String color;
    private final String country;
    private static final String DEFAULT_VALUE = "default";
    private static final Integer DEFAULT_VALUE_OF_SEATS = 4;
    private static final double DEFAULT_ENGINE_VALUE = 1.5;
    private static final String DEFAULT_COLOUR = "white";
    private Key key;

    public Key getKye() {
        return key;
    }

    public void setKey(Key key) {
        if (key == null) {
            this.key = new Key();
        } else {
            this.key = key;
        }
    }

    public Car(String brand, String model, int year, String country, String color, double engineVolume, String transmission, String bodyType, int registrationNumber, int numberOfSeats, boolean isSummerTyres) {
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
        if (engineVolume >= DEFAULT_ENGINE_VALUE) {
            this.engineVolume = engineVolume;
        } else {
            this.engineVolume = DEFAULT_ENGINE_VALUE;
        }
        if (color.isBlank() || color == null) {
            this.color = DEFAULT_COLOUR;
        } else {
            this.color = color;
        }
        if (engineVolume >= 0) {
            this.year = year;
        } else {
            this.year = 2000;
        }
        if (country.isBlank() || country == null) {
            this.country = DEFAULT_VALUE;
        } else {
            this.country = country;
        }
        if (transmission.isBlank() || transmission == null) {
            this.transmission = "auto";
        } else {
            this.transmission = transmission;
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
        if (registrationNumber >= 0) {
            this.registrationNumber = registrationNumber;
        } else {
            this.registrationNumber = countOfCars;
        }
        if (numberOfSeats <= 0) {
            this.numberOfSeats = DEFAULT_VALUE_OF_SEATS;
        } else {
            this.numberOfSeats = numberOfSeats;
        }
        this.isSummerTyres = isSummerTyres;
        this.key = Objects.requireNonNullElseGet(key, Key::new);
        countOfCars++;
    }


    public Car(String brand, int year, String country, String transmission, boolean isSummerTyres) {
        this(brand, null, year, country, null, 0, transmission, null, 0, 0, true);
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
            this.transmission = "auto";
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
        return getBrand() + " " + getModel() + ", " + getYear() + " год выпуска, сборка в " + getCountry() + ", цвет " + getColor() + ", объём двигателя " + getEngineVolume() + " л.";
    }

    public class Key {
        /*В классе Car создайте вложенный класс «Ключ» (Key) с параметрами:
«Удаленный запуск двигателя»,
«Бесключевой доступ».*/
        private final boolean REMOTE_ENGINE_START;
        private final boolean KEYLESS_ACCESS;

        public Key(boolean doesItHaveRemoteEngine, boolean doesItHaveKeylessAccess) {
            this.REMOTE_ENGINE_START = doesItHaveRemoteEngine;
            this.KEYLESS_ACCESS = doesItHaveKeylessAccess;
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
    }
}

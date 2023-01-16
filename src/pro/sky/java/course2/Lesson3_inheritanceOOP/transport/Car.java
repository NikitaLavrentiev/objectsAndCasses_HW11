package pro.sky.java.course2.Lesson3_inheritanceOOP.transport;

import java.time.LocalDate;
import java.util.Objects;

public class Car extends Transport{
    private String transmission;
    private int registrationNumber;
    private final int numberOfSeats;
    private final String bodyType;
    private boolean isSummerTyres;
    private double engineVolume;
    private Key key;
    private static int countOfCars;
    private static final Integer DEFAULT_VALUE_OF_SEATS = 4;
    private static final double DEFAULT_ENGINE_VALUE = 1.5;
    private static final String DEFAULT_TRANSMISSION = "auto";

    public Car(Transport transport, double engineVolume, String transmission, String bodyType, int registrationNumber, int numberOfSeats, boolean isSummerTyres, Key key) {
        setRegistrationNumber(registrationNumber); //для оптимизации, вместо условий поставил сеттеры
        setTransmission(transmission);
        setKey(key);
        setEngineVolume(engineVolume);
        transport = new Transport(); // чекнуть это на работоспособность, скорее всего запись должна быть другая
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

    public Car(Transport transport, Key key) {
        this(new Transport(), new Key());
        countOfCars++;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = Objects.requireNonNullElseGet(key, Key::new);
    }

    public double getEngineVolume() {
        return engineVolume;
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

    public int getMonth() {
        return LocalDate.now().getMonthValue();
    }

    public void changeTiresForSeason() {
        isSummerTyres = getMonth() >= 4 && getMonth() < 12;
    }

    @Override
    public String toString() {
        return  "engine volume " + engineVolume + " l."
                + "\nnumbers of seats is " + numberOfSeats + ", body type " + bodyType + ", registration number " + registrationNumber + ", " + "\ntransmission "
                + transmission + ", with " + (isSummerTyres? "summer tyres": "winter tyres"); //добавить transport и key
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

package pro.sky.java.course2.Lesson2_encapsulationOOP.transport;

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

    public Car(String brand, String model, int year, String country, String color, double engineVolume, String transmission, String bodyType, int registrationNumber, int numberOfSeats, boolean isSummerTyres) {
        if (brand.isBlank() || brand == null) {
            this.brand = DEFAULT_VALUE;
        } else {
            this.brand = brand;
        }
        if (model.isBlank() || model== null) {
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
        if (country.isBlank() || country== null) {
            this.country = DEFAULT_VALUE;
        } else {
            this.country = country;
        }
        if (transmission.isBlank() || transmission== null) {
            this.transmission = "auto";
        } else {
            this.transmission = transmission;}
        if (bodyType.equals("Jeep") ||
                bodyType.equals("Hatchback") || bodyType.equals("Sedan") || bodyType.equals("Coupe") ||
            bodyType.equals("Wagon") || bodyType.equals("Van") || bodyType.equals("MUV/SUV") ||
                bodyType.equals("Convertible")) {
            this.bodyType= bodyType;
        } else if (bodyType.isBlank() || bodyType== null){
            this.bodyType = DEFAULT_VALUE;
        } else {
            this.bodyType = DEFAULT_VALUE;
        }
        if (registrationNumber>=0) {
            this.registrationNumber = registrationNumber;
        } else {
            this.registrationNumber = countOfCars;
        }
        if (numberOfSeats<=0) {
            this.numberOfSeats = DEFAULT_VALUE_OF_SEATS;
        } else {
            this.numberOfSeats = numberOfSeats;
        }
        this.isSummerTyres = isSummerTyres;
        countOfCars++;
    }
    // в конструкторах ниже нет счётчика машин, потенциально удалить их
/*    public Car(String brand, int year, String country, String color, double engineVolume,String transmission, String bodyType, int registrationNumber, int numberOfSeats, boolean isSummerTyres) {
        this(brand, DEFAULT_VALUE, year, country, color, engineVolume, transmission, bodyType, registrationNumber, numberOfSeats, isSummerTyres,);
    }
    public Car(String brand, String model, String country, int year, double engineVolume,String transmission, String bodyType, int registrationNumber, int numberOfSeats, boolean isSummerTyres) {
        this(brand, model, year, country, DEFAULT_COLOUR, engineVolume,transmission, bodyType, registrationNumber, numberOfSeats, isSummerTyres);
    }
    public Car(String brand, String model, String color, double engineVolume,  int year,String transmission, String bodyType, int registrationNumber, int numberOfSeats, boolean isSummerTyres) {
        this(brand, model, year, DEFAULT_VALUE, color, engineVolume,transmission, bodyType, registrationNumber, numberOfSeats, isSummerTyres);
    }*/

   /* в этом конструкторе счётчик есть, нет новых полей String transmission, String bodyType, int registrationNumber, int numberOfSeats, boolean isSummerTyres
   потенциально удалить

   public Car(String model, String country, int year, String color, double engineVolume) {
        this.brand = DEFAULT_VALUE;
        this.model = model;
        this.year = year;
        this.country = country;
        this.color = color;
        this.engineVolume = engineVolume;
        this.isSummerTyres = isSummerTyres;
        countOfCars++;
    }*/

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

    @Override
    public String toString() {
        return getBrand() + " " + getModel() + ", " + getYear() + " год выпуска, сборка в " + getCountry() + ", цвет " + getColor() + ", объём двигателя " + getEngineVolume() + " л.";
    }

}

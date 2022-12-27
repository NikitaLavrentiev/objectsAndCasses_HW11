package pro.sky.java.course2.OOP;

public class Car {
    //Создайте новый проект в IDEA. Создайте класс «Автомобиль», у которого есть:
    //
    //марка (brand),
    //модель (model),
    //объем двигателя в литрах (engineVolume),
    //цвет кузова (color),
    //год производства (year),
    //страна сборки (country).
    private String brand;
    private String model;
    private float engineVolume;
    private String color;
    private int year;
    private String country;

    public Car(String brand, String model, int year, String country, String color, float engineVolume) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.year = year;
        this.country = country;
    }

    /* Если передана пустая строка или null в поля модель, марка машины и страна сборки, то значение по умолчанию — default.
     Если переданный объем двигателя ≤=0, то значение по умолчанию — 1,5 л.
     Если передана пустая строка или null, то цвет кузова по умолчанию — белый.
     Если год производства ≤0, то значение по умолчанию — 2000.*/

    public Car(String model, int year, String country, String color, float engineVolume) { //исправить гетеры и добавить конструкторы, не до конца понятно из-за чего ошибки вылетают возможно в гетерах нужно переписать возвращаемые значения без равно default и тд, поскольку поля private
        this.brand = "default";
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.year = year;
        this.country = country;
    }

    public String getBrand() {
        if (brand != null) {
            return brand;
        } else {
            return brand = "default";
        }
    }

    public String getModel() {
        if (model != null) {
            return model;
        } else {
            return model = "default";
        }
    }

    public float getEngineVolume() {
        if (engineVolume >= 1.5f) {
            return engineVolume;
        } else {
            return engineVolume=  1.5F;
        }
    }

    public String getColor() {
        if (color == null || color == " " || color == "") {
            return color = "белый";
        } else {
            return color;
        }
    }

    public int getYear() {
        if (year >= 0) {
            return year;
        } else {
            return year = 2000;
        }
    }

    public String getCountry() {
        if (country != null) {
            return country;
        } else {
            return "default";
        }
    }

    @Override
    public String toString() {
        return getBrand + " " + getModel + ", " + getYear + " год выпуска, сборка в " + getCountry + ", цвет " + getColor + ", объём двигателя " + getEngineVolume + " л.";
    }

}

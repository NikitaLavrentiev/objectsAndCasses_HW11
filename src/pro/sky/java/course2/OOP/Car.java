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
    private double engineVolume;
    private String color;
    private int year;
    private String country;

    public Car(String brand, String model, int year, String country, String color, double engineVolume) {
        if (brand.equals(null) || brand.equals("")) { // 2. но тоже не сработало, только теперь система крашится если ноль
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model != null || model != "") { // 1. сделал проверку сначала так чтобы когда null или пустота присваивалось значение default, но не сработало, потом попробовал методом выше
            this.model = model;
        } else {
            this.model = "default";
        }
        if (engineVolume >= 1.5) {
            this.engineVolume = engineVolume;
        } else {
            this.engineVolume = 1.5;
        }
        if (color != null || color != "") {
            this.color = color;
        } else {
            this.color = "белый";
        }
        if (engineVolume >= 0) {
            this.year = year;
        } else {
            this.year = 2000;
        }
        if (country != null || country != "") {
            this.country = country;
        } else {
            this.country = "default";
        }
    }

    /* Если передана пустая строка или null в поля модель, марка машины и страна сборки, то значение по умолчанию — default.
     Если переданный объем двигателя ≤=0, то значение по умолчанию — 1,5 л.
     Если передана пустая строка или null, то цвет кузова по умолчанию — белый.
     Если год производства ≤0, то значение по умолчанию — 2000.*/

    public Car(String model, int year, String country, String color, double engineVolume) { //выдаёт ошибку при создании такого шаблона
        this.brand = "default";
        this.model = model;
        this.year = year;
        this.country = country;
        this.color = color;
        this.engineVolume = engineVolume;
    }

    public Car(String brand, int year, String country, String color, double engineVolume) { //выдаёт ошибку при создании такого шаблона, не удивительно ведь model тут в параметре на приём нет. можно ли сделать так, чтобы он по if/else проходился из первого конструктора и model устанавливался default как в первом конструкторе
        this(brand, model, year, country, color, engineVolume);
    }
       this(brand,model,year,country,color,engineVolume);
}

    public String getBrand() {
        if (brand != null || brand != "") {
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

    public double getEngineVolume() {
        if (engineVolume >= 1.5) {
            return engineVolume;
        } else {
            return engineVolume = 1.5;
        }
    }

    public String getColor() {
        if (color == null || color == "") {
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
        if (country != null || country != "") {
            return country;
        } else {
            return "default";
        }
    }

    @Override
    public String toString() {
        return getBrand() + " " + getModel() + ", " + getYear() + " год выпуска, сборка в " + getCountry() + ", цвет " + getColor() + ", объём двигателя " + getEngineVolume() + " л.";
    }

}

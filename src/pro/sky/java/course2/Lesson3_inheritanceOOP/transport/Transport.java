package pro.sky.java.course2.Lesson3_inheritanceOOP.transport;

public abstract class Transport {
    /*Создайте класс Transport, который содержит в себе следующие параметры:

«Марка»,
«Модель»,
«Год выпуска»,
«Страна производства»,
«Цвет кузова»,
«Максимальная скорость передвижения».*/
    private final String brand;
    private final String model;
    private final int year;
    private final String country;
    private String color;
    private int speed;
    protected static final String DEFAULT_VALUE = "default";
    protected static final String DEFAULT_COLOUR = "white";
    protected static final Integer MAX_SPEED = 300;

    public Transport(String brand, String model, int year, String country, String color, int speed) {
        setColor(color);
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
        setSpeed(speed);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
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

    public void setColor(String color) {
        if (color.isBlank() || color == null) {
            this.color = DEFAULT_COLOUR;
        } else {
            this.color = color;
        }
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed < 0) {
            this.speed = 0;
        } else if (speed > MAX_SPEED) {
            this.speed = speed;
        } else {
            this.speed = speed;
        }
    }

    @Override
    public String toString() { //возможно это бесполезно
        return '\n' + brand + " " + model + ", production year " + year + ", made in " + country + ", colour is " + color + ", speed is " + speed + ",";
    }

}

package pro.sky.java.course2.Lesson4_polimorphism_geneticOOP.transport;

public abstract class Transport {
    protected static final String DEFAULT_VALUE = "default";
    protected static final String DEFAULT_COLOUR = "white";
    protected static final Integer MAX_SPEED = 300;
    private final String brand;
    private final String model;
    private final int year;
    private final String country;
    private String color;
    private int speed;

    public Transport(String brand, String model, int year, String country, String color, int speed) {
        setColor(color);
        if (brand == null || brand.isBlank()) {
            this.brand = DEFAULT_VALUE;
        } else {
            this.brand = brand;
        }
        if (model == null || model.isBlank()) {
            this.model = DEFAULT_VALUE;
        } else {
            this.model = model;
        }
        if (year >= 0) {
            this.year = year;
        } else {
            this.year = 2000;
        }
        if (country == null || country.isBlank()) {
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
        if (color == null || color.isBlank()) {
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
    public String toString() {
        return '\n' + brand + " " + model + ", production year " + year + ", made in " + country + ", colour is " + color + ", speed is " + speed + ",";
    }

}

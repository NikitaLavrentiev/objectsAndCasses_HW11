package pro.sky.java.course2.Lesson4_polimorphism_geneticOOP.transport;

import pro.sky.java.course2.Lesson4_polimorphism_geneticOOP.Driver.Driver;

public abstract class Transport<D extends Driver> implements Competing {
    protected static final String DEFAULT_VALUE = "default";
    private static final double DEFAULT_ENGINE_VALUE = 1.5;
    private final String brand;
    private final String model;
    private double engineVolume;
    private final D driver;

    public Transport(String brand, String model, double engineVolume,D driver) {
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
        setEngineVolume(engineVolume);
        this.driver = driver;
    }
    public Transport(String brand, String model, double engineVolume) {
        this(brand, model, engineVolume, (null));
    }

    public D getDriver() {
        if (driver == null) {
            throw new RuntimeException("There is no driver " + this + " is empty.");
        } else {
            return driver;
        }
    }
    public void setEngineVolume(double engineVolume) {
        if (engineVolume >= DEFAULT_ENGINE_VALUE) {
            this.engineVolume = engineVolume;
        } else {
            this.engineVolume = DEFAULT_ENGINE_VALUE;
        }
    }

    public double getEngineVolume() {
        return engineVolume;
    }
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public void startMoving() {
        getDriver().toDrive();
        System.out.println(getBrand() + " " + getModel() + " started moving on a route");
        System.out.println(getBrand() + " is moving right now.");
    }

    public void endMoving() {
        getDriver().stopVehicle();
        System.out.println(getBrand() + " " + getModel() + " slows down.");
        System.out.println(getBrand() + " " + getModel() + "  has stopped.");
    }

    public void willParticipate(D driver) {
        if (driver.isHasDrivesLicense()) {
            System.out.println("Driver " + driver.getFullName() + " drives " + this + " and will participate in the race.");
        } else {
            System.out.println("Driver " + driver.getFullName() + " excluded.");
        }
    }

    @Override
    public String toString() {
        return brand + " " + model + ", engine volume " + engineVolume;
    }


}

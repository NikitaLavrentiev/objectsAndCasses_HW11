package pro.sky.java.course2_OOP.Lesson8_hash_function.Driver;

import java.util.Objects;

public abstract class Driver {

    protected final double BEGINNER = 0.0;
    private final String fullName;
    private boolean hasDrivesLicense;
    private double experienceYear;

    public Driver(String fullName) {
        if (fullName == null || fullName.isEmpty() || fullName.isBlank()) {
            throw new RuntimeException("Enter full name to create a driver");
        } else {
            this.fullName = fullName;
        }
        this.hasDrivesLicense = false;
        this.experienceYear = BEGINNER;
    }

    public Driver(String fullName, boolean hasDrivesLicense, double experienceYear) throws IllegalTypeOfLicense {
        this(fullName);
        this.hasDrivesLicense = hasDrivesLicense;
        setExperienceYear(experienceYear);
    }

    public String getFullName() {
        return fullName;
    }

    public boolean isHasDrivesLicense() {
        return hasDrivesLicense;
    }

    public void setHasDrivesLicense(boolean hasDrivesLicense) {
        this.hasDrivesLicense = hasDrivesLicense;
    }

    public double getExperienceYear() {
        return experienceYear;
    }

    public void setExperienceYear(double experienceYear) {
        if (isHasDrivesLicense()) {
            this.experienceYear = experienceYear;
        } else {
            System.out.println("No license = no experience");
        }
    }

    public void toDrive() {
        if (isHasDrivesLicense() || getExperienceYear() >= 0.1) {
            System.out.println(getFullName() + " started the engine, pressed the pedal and drove.");
        } else {
            System.out.println("No license B = no drive.");
        }
    }

    public void stopVehicle() {
        if (!isHasDrivesLicense() && getExperienceYear() == BEGINNER) {
            throw new RuntimeException("Nothing to stop");
        } else {
            System.out.println(getFullName() + " has stopped vehicle");
        }
    }

    public void refuelTheVehicle() {
        if (!isHasDrivesLicense() && getExperienceYear() <= BEGINNER) {
            throw new RuntimeException("Nothing to refuel");
        } else {
            System.out.println(getFullName() + " has refuel vehicle");
        }
    }

    @Override
    public String toString() {
        return "Driver{" +
                "fullName='" + fullName + '\'' +
                ", hasDrivesLicense=" + hasDrivesLicense +
                ", experienceYear=" + experienceYear +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return hasDrivesLicense == driver.hasDrivesLicense && Double.compare(driver.experienceYear, experienceYear) == 0 && fullName.equals(driver.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, hasDrivesLicense, experienceYear);
    }
}

package pro.sky.java.course2_OOP.Lesson6_exceptions.Driver;

public class LicenseB extends Driver {
    public LicenseB(String fullName) {
        super(fullName);
    }

    public LicenseB(String fullName, boolean hasDrivesLicense, double experienceYear) {
        super(fullName, hasDrivesLicense, experienceYear);
    }

    @Override
    public void toDrive() {
        if (isHasDrivesLicense() || getExperienceYear() >= BEGINNER) {
            System.out.println(getFullName() + " is drove.");
        } else {
            System.out.println("No license B = get out");
        }
    }

    public void stopVehicle() {
        System.out.println(getFullName() + " has stopped a car");
    }


    public void refuelTheVehicle() {
        System.out.println(getFullName() + " has refuel car");
    }

    @Override
    public String toString() {
        return "LicenseB{} " + super.toString();
    }
}
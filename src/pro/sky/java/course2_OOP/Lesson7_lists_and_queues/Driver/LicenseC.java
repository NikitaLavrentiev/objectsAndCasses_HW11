package pro.sky.java.course2_OOP.Lesson7_lists_and_queues.Driver;

public class LicenseC extends Driver {
    public LicenseC(String fullName) {
        super(fullName);
    }

    public LicenseC(String fullName, boolean hasDrivesLicense, double experienceYear) {
        super(fullName, hasDrivesLicense, experienceYear);
    }

    @Override
    public String toString() {
        return "LicenseC{} " + super.toString();
    }
}

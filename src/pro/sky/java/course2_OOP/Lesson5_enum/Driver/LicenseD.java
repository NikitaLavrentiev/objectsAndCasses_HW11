package pro.sky.java.course2_OOP.Lesson5_enum.Driver;

public class LicenseD extends Driver {
    public LicenseD(String fullName) {
        super(fullName);
    }

    public LicenseD(String fullName, boolean hasDrivesLicense, double experienceYear) {
        super(fullName, hasDrivesLicense, experienceYear);
    }
    @Override
    public String toString() {
        return "LicenseD{} " + super.toString();
    }
}
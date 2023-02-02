package pro.sky.java.course2_OOP.Lesson8_Collections_Associative_arrays_and_maps.Driver;

public class LicenseD extends Driver {
    public LicenseD(String fullName) {
        super(fullName);
    }

    public LicenseD(String fullName, boolean hasDrivesLicense, double experienceYear) throws IllegalTypeOfLicense {
        super(fullName, hasDrivesLicense, experienceYear);
    }

    @Override
    public String toString() {
        return "LicenseD{} " + super.toString();
    }
}
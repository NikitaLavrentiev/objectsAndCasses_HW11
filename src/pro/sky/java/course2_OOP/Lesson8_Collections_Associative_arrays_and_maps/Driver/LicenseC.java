package pro.sky.java.course2_OOP.Lesson8_Collections_Associative_arrays_and_maps.Driver;

public class LicenseC extends Driver {
    public LicenseC(String fullName) {
        super(fullName);
    }

    public LicenseC(String fullName, boolean hasDrivesLicense, double experienceYear) throws IllegalTypeOfLicense {
        super(fullName, hasDrivesLicense, experienceYear);
    }

    @Override
    public String toString() {
        return "LicenseC{} " + super.toString();
    }
}

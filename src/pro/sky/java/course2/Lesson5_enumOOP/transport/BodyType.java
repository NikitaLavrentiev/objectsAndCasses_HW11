package pro.sky.java.course2.Lesson5_enumOOP.transport;

public enum BodyType {
    SEDAN("Sedan"),
    HATCHBACK("Hatchback"),
    COUPE("Coupe"),
    UNIVERSAL("Universal"),
    SUV("SUV"),
    CROSSOVER("Crossover"),
    PICKUP("Pickup"),
    VAN("Van"),
    MINIVAN("Minivan");

    final String type;

    BodyType(String type) {
        this.type = type;
    }
    public String getBodyType() {
        return type;
    }

    @Override
    public String toString() {
        return "BodyType is " + type;
    }

}

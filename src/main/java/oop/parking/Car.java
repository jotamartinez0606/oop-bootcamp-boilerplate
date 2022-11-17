package oop.parking;

public class Car {
    private final String licenseNumber;
    private final boolean large;

    public Car(final String licenseNumber, final boolean large) {
        this.licenseNumber = licenseNumber;
        this.large = large;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public boolean isLarge() {
        return large;
    }
}

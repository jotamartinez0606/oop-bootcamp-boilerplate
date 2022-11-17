package oop.parking;

public class Car {
    private final String licenseNumber;
    private final boolean isLarge;

    public Car(final String licenseNumber, final boolean isLarge) {
        this.licenseNumber = licenseNumber;
        this.isLarge = isLarge;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public boolean isLarge() {
        return isLarge;
    }
}

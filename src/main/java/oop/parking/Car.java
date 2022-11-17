package oop.parking;

import java.util.Set;

public class Car {
    private final String licenseNumber;
    private final boolean large;

    private final boolean handicapped;
    private ParkStrategy parkStrategy;

    public Car(final String licenseNumber, final boolean large, final boolean handicapped) {
        this.licenseNumber = licenseNumber;
        this.large = large;
        this.handicapped = handicapped;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public boolean isLarge() {
        return large;
    }
    public boolean isHandicapped() {
        return handicapped;
    }

    public ParkStrategy selectParkStrategy(Set<Parking> parkingLots) {

        if (this.isHandicapped()) {
            return new HandicappedCarParkStrategy();
        }
        return null;
    }
}

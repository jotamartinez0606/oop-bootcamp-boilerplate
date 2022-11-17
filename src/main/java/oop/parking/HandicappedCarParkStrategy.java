package oop.parking;

import java.util.Set;

public class HandicappedCarParkStrategy implements ParkStrategy {
    @Override
    public boolean park(Car car, Set<Parking> parkingSet) {
        boolean success = false;
        search: for (Parking parking : parkingSet) {
            if (parking.isHandicappedFriendly()) {
                success = parking.park(car.getLicenseNumber());
                if (success) break search;
            }
        }
        return success;
    }
}

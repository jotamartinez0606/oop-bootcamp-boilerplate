package oop.parking;

import java.util.Set;

public interface ParkStrategy {

    boolean park (Car car, Set<Parking> parkingSet);
}

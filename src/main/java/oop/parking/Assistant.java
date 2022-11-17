package oop.parking;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Assistant  {

  private static final double MIN_FREE_PERCENTAGE_THRESHOLD = 0.2;
  private Set<Parking> parkingLots;

  public Assistant(Parking... parkingLots) {
    this.parkingLots = new HashSet<>(Arrays.asList(parkingLots));
  }

  public boolean park(Car car) {
    if (!car.isLarge()) {
      for (Parking parking : parkingLots) {
        if (parking.availableSpace() > isCapacityGreaterThanThreshold(parking)) {
          return parking.park(car.getLicenseNumber());
        }
      }
    } else {
      double availableCapacityPercentage = 0.0;
      Parking chosenParking = null;
      for (Parking parking : parkingLots) {
        double currentParkingAvailableCapacityPercentage = ((parking.availableSpace() / parking.getMaxCapacity()) * 1.0) * 100;
        if (currentParkingAvailableCapacityPercentage > availableCapacityPercentage) {
          chosenParking = parking;
          availableCapacityPercentage = currentParkingAvailableCapacityPercentage;
        }
      }
      return chosenParking.park(car.getLicenseNumber());
    }
    return false;
  }

  private int isCapacityGreaterThanThreshold(Parking parking) {
    return (int) (parking.getMaxCapacity() * MIN_FREE_PERCENTAGE_THRESHOLD);
  }

  public boolean retrieve(Car car) {
    for ( Parking parking : parkingLots) {
      if(parking.containsCar(car.getLicenseNumber()))
      {
        return parking.retrieve(car.getLicenseNumber());
      }
    }
    return false;
  }
}

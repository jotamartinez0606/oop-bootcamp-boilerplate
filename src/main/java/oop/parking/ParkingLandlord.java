package oop.parking;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class ParkingLandlord implements PropertyChangeListener {
    private static final int SEVENTY_FIVE_PERCENT_VALUE = 75;
    private boolean purchaseNeeded;

    public ParkingLandlord() {
        this.purchaseNeeded = false;
    }

    public boolean isPurchaseNeeded() {
        return purchaseNeeded;
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        System.out.println("New vehicles in the parking!!");
        final var parkingCapacityChangeEvent = (ParkingCapacityChangeEvent) evt.getNewValue();
        evaluateStatus(parkingCapacityChangeEvent);
    }

    private void evaluateStatus(ParkingCapacityChangeEvent parkingCapacityChangeEvent) {
        if (parkingCapacityChangeEvent.getPercentageOfOccupancy() >= SEVENTY_FIVE_PERCENT_VALUE) {
            System.out.println("Parking crowded, I need to buy another one");
            this.purchaseNeeded = true;
        }
    }
}
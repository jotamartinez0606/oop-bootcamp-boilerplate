package oop.parking;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class ParkingLandlord implements PropertyChangeListener {
    private static final int SEVENTY_FIVE_PERCENT_VALUE = 75;
    public static final int TWENTY_PERCENT_VALUE = 20;
    private boolean purchaseNeeded;
    private boolean closingNeeded;

    public ParkingLandlord() {
        this.purchaseNeeded = false;
        this.closingNeeded = false;
    }

    public boolean isPurchaseNeeded() {
        return purchaseNeeded;
    }

    public boolean isClosingNeeded() {
        return closingNeeded;
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        System.out.println("New vehicles in the parking!!");
        final var parkingCapacityChangeEvent = (ParkingCapacityChangeEvent) evt.getNewValue();
        evaluateParkingStatusToPurchaseMoreParking(parkingCapacityChangeEvent);
        evaluateParkingStatusToSellParking(parkingCapacityChangeEvent);

    }

    private void evaluateParkingStatusToSellParking(ParkingCapacityChangeEvent parkingCapacityChangeEvent) {
        if (parkingCapacityChangeEvent.getPercentageOfOccupancy() < TWENTY_PERCENT_VALUE) {
            System.out.println("Parking usage less than 20%");
            this.closingNeeded = true;
        } else {
            this.closingNeeded = false;
        }
    }

    private void evaluateParkingStatusToPurchaseMoreParking(ParkingCapacityChangeEvent parkingCapacityChangeEvent) {
        if (parkingCapacityChangeEvent.getPercentageOfOccupancy() >= SEVENTY_FIVE_PERCENT_VALUE) {
            System.out.println("Parking crowded, I need to buy another one");
            this.purchaseNeeded = true;
        }
    }

}
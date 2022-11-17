package oop.parking;

public class ParkingCapacityChangeEvent {

    private int maxCapacity;
    private int currentCapacity;

    public ParkingCapacityChangeEvent(int maxCapacity, int currentCapacity) {
        this.maxCapacity = maxCapacity;
        this.currentCapacity = currentCapacity;
    }

    public double getPercentageOfOccupancy() {
        return ((maxCapacity - currentCapacity) * 1.0 / maxCapacity) * 100;
    }
}
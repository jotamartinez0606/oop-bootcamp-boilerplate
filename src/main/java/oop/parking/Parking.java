package oop.parking;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.HashSet;
import java.util.Set;

public class Parking {

    private Set<String> parkedCars;
    private int maxCapacity;
    private PropertyChangeSupport support;

    public Parking(int maxCapacity){
        parkedCars = new HashSet<>();
        this.maxCapacity = maxCapacity;
        this.support = new PropertyChangeSupport(this);
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public boolean park(String licenseNumber) {
        final var eventPrevious = new ParkingCapacityChangeEvent(maxCapacity, availableSpace());

        boolean success = false;
        if(availableSpace() > 0) {
            success = parkedCars.add(licenseNumber);
        }
        final var eventAfter = new ParkingCapacityChangeEvent(maxCapacity, availableSpace());
        support.firePropertyChange("parkingCapacityChangeEvent", eventPrevious, eventAfter);
        return success;
    }

    public boolean isParked(String licenseNumber) {
        return parkedCars.contains(licenseNumber);
    }

    public boolean retrieve(String licenseNumber) {
        return parkedCars.remove(licenseNumber);
    }

    public int availableSpace() {
        return maxCapacity - parkedCars.size();
    }

    public boolean containsCar(String licenseNumber) {
        return parkedCars.contains(licenseNumber);
    }

    public void addPropertyChangeListener(PropertyChangeListener observer) {
        support.addPropertyChangeListener(observer);
    }
    public void removePropertyChangeListener(PropertyChangeListener observer) {
        support.removePropertyChangeListener(observer);
    }
}

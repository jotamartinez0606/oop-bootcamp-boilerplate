package oop.parking;

import oop.observer.PCLNewsAgency;
import oop.observer.PCLNewsChannel;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class ParkingTest {
    Parking parkingLot;

    @BeforeMethod
    public void setUp() {
        parkingLot = new Parking(1);
    }

    @Test
    public void itShouldParkCar() {
        assertTrue(parkingLot.park("MAT-001"));
        assertTrue(parkingLot.isParked("MAT-001"));
        assertFalse(parkingLot.isParked("MAT-002"));
    }

    @Test
    public void itShouldRetrieveCar() {
        parkingLot.park("MAT-001");
        assertTrue(parkingLot.retrieve("MAT-001"));
        assertFalse(parkingLot.retrieve("MAT-002"));
    }

    @Test
    public void itShouldNotParkIfFull() {
        parkingLot.park("MAT-001");
        assertFalse(parkingLot.park("MAT-002"));
    }

    @Test
    public void itShouldNotifyLandlordWhenNewPurchaseNecessary() {
        ParkingLandlord landlord = new ParkingLandlord();
        Parking parkingLot = new Parking(10);
        parkingLot.addPropertyChangeListener(landlord);
        for (int i = 1; i <= 8; i++) {
            parkingLot.park("MAT-00" + i);
        }
        assertTrue(landlord.isPurchaseNeeded());
    }

    @Test
    public void itShouldNotifyLandlordWhenParkingShouldBeClosed() {
        ParkingLandlord landlord = new ParkingLandlord();
        Parking parkingLot = new Parking(10);
        parkingLot.addPropertyChangeListener(landlord);

        parkingLot.park("MAT-001");
        assertTrue(landlord.isClosingNeeded());

        parkingLot.park("MAT-002");
        assertFalse(landlord.isClosingNeeded());
    }

}
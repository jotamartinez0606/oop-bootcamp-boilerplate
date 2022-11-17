package oop.parking;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class AssistantTest {

  Parking parking;
  Assistant assistant;
  Car car;

  @BeforeMethod
  public void setUp() {
    car = new Car("MAT-001", false, false);
    parking = new Parking(2, false);
    assistant = new Assistant(parking);
  }

  @Test
  public void itShouldParkCar() {
    assertTrue(assistant.park(car));
    assertFalse(assistant.park(car));
  }

  @Test
  public void itShouldRetrieveCar() {
    assistant.park(car);
    assertTrue(assistant.retrieve(car));
    assertFalse(assistant.retrieve(car));
  }

  @Test
  public void itShouldParkCarInMultipleParkingLots() {
    Parking parking2 = new Parking(2, false);
    assistant = new Assistant(parking, parking2);
    assertTrue(assistant.park(new Car("MAT-001",false, false )));
    assertTrue(assistant.park(new Car("MAT-002",false, false )));
    assertTrue(assistant.park(new Car("MAT-003",false, false )));
    assertTrue(assistant.park(new Car("MAT-004",false, false )));
    assertFalse(assistant.park(new Car("MAT-005", false, false )));
  }

  @Test
  public void itShouldParkCarLessThanEightyPercentFull() {
    Parking parking = new Parking(10, false);
    assistant = new Assistant(parking);

    for(int i = 1; i <= 8; i++) {
      var license = "MAT-00" + i;
      assertTrue(assistant.park(new Car(license,false,  false)));
    }
    assertFalse(assistant.park(new Car("MAT-009", false, false )));
  }


  @Test
  public void itShouldParkLargeCars() {
    Parking parking = new Parking(2, false);
    Car largeCar = new Car("MAT-001", true,  false);
    Car regularCar = new Car("MAT-002", false,  false);
    Assistant assistant = new Assistant(parking);

    assertTrue(assistant.park(largeCar));
    assertTrue(assistant.park(regularCar));

  }

  @Test
  public void itShouldParkLargeCarsInParkingLotsLeastUsage() {
    Parking parking = new Parking(5, false);
    Parking parking2 = new Parking(5, false);

    assistant = new Assistant(parking, parking2);

    assertTrue(assistant.park(new Car("MAT-001",true, false )));
    assertTrue(assistant.park(new Car("MAT-002",true,  false)));

    assertEquals(parking.availableSpace(), 4);
    assertEquals(parking2.availableSpace(), 4);
  }

  @Test
  public void itShouldParkHandicappedCarsInHandicappedFriendlyParking() {
    Parking parking = new Parking(5, false);
    Parking parking2 = new Parking(5, true);

    assistant = new Assistant(parking, parking2);

    assertTrue(assistant.park(new Car("MAT-001",false, true)));
    assertTrue(parking2.isParked("MAT-001"));
    //assertFalse(parking.isParked("MAT-001")); //todo: fix this

  }
}

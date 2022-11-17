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
    car = new Car("MAT-001", false);
    parking = new Parking(2);
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
    Parking parking2 = new Parking(2);
    assistant = new Assistant(parking, parking2);
    assertTrue(assistant.park(new Car("MAT-001",false)));
    assertTrue(assistant.park(new Car("MAT-002",false)));
    assertTrue(assistant.park(new Car("MAT-003",false)));
    assertTrue(assistant.park(new Car("MAT-004",false)));
    assertFalse(assistant.park(new Car("MAT-005", false)));
  }

  @Test
  public void itShouldParkCarLessThanEightyPercentFull() {
    Parking parking = new Parking(10);
    assistant = new Assistant(parking);

    for(int i = 1; i <= 8; i++) {
      var license = "MAT-00" + i;
      assertTrue(assistant.park(new Car(license,false)));
    }
    assertFalse(assistant.park(new Car("MAT-009", false)));
  }


  @Test
  public void itShouldParkLargeCars() {
    Parking parking = new Parking(2);
    Car largeCar = new Car("MAT-001", true);
    Car regularCar = new Car("MAT-002", false);
    Assistant assistant = new Assistant(parking);

    assertTrue(assistant.park(largeCar));
    assertTrue(assistant.park(regularCar));

  }

  @Test
  public void itShouldParkLargeCarsInParkingLotsLeastUsage() {
    Parking parking = new Parking(5);
    Parking parking2 = new Parking(5);

    assistant = new Assistant(parking, parking2);

    assertTrue(assistant.park(new Car("MAT-001",true)));
    assertTrue(assistant.park(new Car("MAT-002",true)));

    assertEquals(parking.availableSpace(), 4);
    assertEquals(parking2.availableSpace(), 4);
  }
}

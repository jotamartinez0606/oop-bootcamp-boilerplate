package oop.unitConverter;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import org.testng.annotations.Test;

public class UnitConverterTest {

  @Test
  public void itShouldCompareFeetToMeters() {
    assertEquals(UnitConverter.compareFeetToMeters(5.0), 1.524);
    assertNotEquals(UnitConverter.compareFeetToMeters(4.0), 23.32);
  }

  @Test
  public void itShouldCompareInchesToYards() {
    assertEquals(UnitConverter.compareInchesToYards(5.0), 0.1389, 0.01);
    assertNotEquals(UnitConverter.compareInchesToYards(3.0), 0.0907);
  }

  @Test
  public void itShouldCompareMeterToCentimeters() {
    assertEquals(UnitConverter.compareMeterToCentimeters(2.0), 200.0);
    assertNotEquals(UnitConverter.compareMeterToCentimeters(5.0), 400.0);
  }

  @Test
  public void itShouldCompareGallonsToLiters() {
    assertEquals(UnitConverter.compareGallonsToLiters(4.0), 15.1416);
    assertNotEquals(UnitConverter.compareGallonsToLiters(3.0), 12.0709);
  }


}
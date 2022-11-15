package oop.unitConverter;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import org.testng.annotations.Test;

public class UnitConverterTest {

  @Test
  public void itShouldConvertFeetToMeters() {
    assertEquals(UnitConverter.convertFeetToMeters(5.0), 1.524);
    assertNotEquals(UnitConverter.convertFeetToMeters(4.0), 23.32);
  }

  @Test
  public void itShouldConvertMeterToCentimeters() {
    assertEquals(UnitConverter.convertMeterToCentimeters(2.0), 200.0);
    assertNotEquals(UnitConverter.convertMeterToCentimeters(5.0), 400.0);
  }

  @Test
  public void itShouldConvertGallonsToLiters() {
    assertEquals(UnitConverter.convertGallonsToLiters(4.0), 15.1416);
    assertNotEquals(UnitConverter.convertGallonsToLiters(3.0), 12.0709);
  }
}
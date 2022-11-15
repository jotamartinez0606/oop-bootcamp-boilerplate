package oop.unitConverter;

public class UnitConverter {

  private static final double FEET_TO_METERS = 0.3048;
  private static final double METERS_TO_CENTIMETERS = 100.00;
  private static final double GALLONS_TO_LITERS = 3.7854;

  public static double convertFeetToMeters(double feet) {
    return feet * FEET_TO_METERS;
  }

  public static double convertMeterToCentimeters(double meters) {
    return meters * METERS_TO_CENTIMETERS;
  }

  public static double convertGallonsToLiters(double gallons) {
    return gallons * GALLONS_TO_LITERS;
  }
}

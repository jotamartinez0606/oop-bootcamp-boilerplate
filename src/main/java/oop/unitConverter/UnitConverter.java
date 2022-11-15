package oop.unitConverter;

public class UnitConverter {

  private static final double FEET_TO_METERS = 0.3048;
  private static final double INCHES_TO_YARDS = 0.0278;
  private static final double METERS_TO_CENTIMETERS = 100.00;
  private static final double GALLONS_TO_LITERS = 3.7854;

  public static double compareFeetToMeters(double feet) {
    return feet * FEET_TO_METERS;
  }

  public static double compareInchesToYards(double inches) {
    return inches * INCHES_TO_YARDS;
  }

  public static double compareMeterToCentimeters(double meters) {
    return meters * METERS_TO_CENTIMETERS;
  }

  public static double compareGallonsToLiters(double gallons) {
    return gallons * GALLONS_TO_LITERS;
  }
}

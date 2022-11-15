package oop.measure;

public class Measure {

  private static final double FEET_TO_METERS = 0.3048;
  private static final double INCHES_TO_YARDS = 0.0278;

  public double compareFeetToMeters (double feet) {
    return feetToMeters(feet);
  }

  public double compareInchesToYards (double inches) {
    return inchesToYards(inches);
  }

  private static double feetToMeters(double feet) {
    return feet * FEET_TO_METERS;
  }

  private static double inchesToYards(double inches) {
    return inches * INCHES_TO_YARDS;
  }
}

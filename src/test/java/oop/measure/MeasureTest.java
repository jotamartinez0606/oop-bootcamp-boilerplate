package oop.measure;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class MeasureTest {

  Measure measure = new Measure();


  @Test
  public void itShouldCompareFeetToMeters() {
    assertEquals(measure.compareFeetToMeters(5.0), 1.524);
  }

  @Test
  public void itShouldCompareInchesToYards() {
    assertEquals(measure.compareInchesToYards(1.0), 0.0278);
  }


}
package oop.measure;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class MeasureTest {

  @Test
  public void itShouldCompareFeetToMeters() {
    assertEquals(Measure.compareFeetToMeters(5.0), 1.524);
  }

  @Test
  public void itShouldCompareInchesToYards() {
    assertEquals(Measure.compareInchesToYards(5.0), 0.1389, 0.01);
  }


}
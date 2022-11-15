package oop.measure;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class MeasureTest {


  @Test
  public void itShouldCompareFeetToMeters() {

    assertEquals(Measure.compareFeetToMeters(5.0), 1.524);

  }

}
package oop.unitConverter;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

public class InchTest {

    private Measure inchMeasure = new Inch();

    @Test
    public void itShouldConvertInchesToYards() {
        assertEquals(inchMeasure.convert(5.0), 0.1389, 0.01);
        assertNotEquals(inchMeasure.convert(3.0), 0.0907);
    }

    @Test
    public void itShouldSumTwoInchMeasures(){
        Measure valueInInch = new Inch(2.0);
        assertEquals(valueInInch.add(new Inch(2.0)).getValue(), 4.0);
    }

    @Test
    public void itShouldAddInchesAndMeters() {
        Measure valueInInch = new Inch(2.0);
        Measure valueInMeters = new Meter(1.0);
        Measure finalValue = valueInInch.add(valueInMeters);
        assertEquals(finalValue.getValue(), 41.37008, 0.001);
    }
}
package oop.unitConverter;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CelsiusTest {

    @Test
    public void itShouldConvertToFahrenheit() {
        Celsius temperature = new Celsius(26.6667);
        assertEquals(temperature.convert(80), 26.6667, 0.01);
    }
}
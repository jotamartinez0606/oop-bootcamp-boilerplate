package oop.stringCalculator;

import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class stringCalculatorTest {

    @Test
    public void itShouldReturnZeroWhenEmptyStringGiven() {
        final StringCalculator stringCalculator = new StringCalculator();
        final int actualResult = stringCalculator.add("");
        assertEquals(actualResult, 0);
    }

}
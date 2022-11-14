package oop.rectangle;

import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class RectangleTest {

    final Rectangle rectangle = new Rectangle(1, 2);

    @Test
    public void itShouldReturnRectangle() {
        assertNotEquals(rectangle.getHeight(), rectangle.getWidth());
    }

    @Test
    public void itShouldCalculateRectanglePerimeter() {
        assertEquals(rectangle.calculatePerimeter(), 6);
    }

    @Test
    public void itShouldCalculateRectangleArea() {
        assertEquals(rectangle.calculateArea(), 2);
        assertEquals(new Rectangle(2, 5).calculateArea(), 10);
    }

}
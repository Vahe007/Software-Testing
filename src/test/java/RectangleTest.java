package org.example;

import org.example.Rectangle;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class RectangleTest {

    @Test
    public void testInitValidValues() {
        Rectangle rect = new Rectangle(5.0, 3.0);
        assertEquals(15.0, rect.calculateArea());
        assertEquals(16.0, rect.calculatePerimeter(), "Some additional message here");
        assertFalse(rect.isSquare());
        assertEquals(Math.sqrt(34.0), rect.getDiagonalLength());
    }

    @Test
    public void testInitInvalidWidth() {
        assertThrows(IllegalArgumentException.class, () -> new Rectangle(-2.0, 3.0));
    }

    @Test
    public void testInitInvalidHeight() {
        assertThrows(IllegalArgumentException.class, () -> new Rectangle(5.0, -1.0));
    }

    @Test
    public void testIsSquare() {
        Rectangle square = new Rectangle(4.0, 4.0);
        assertTrue(square.isSquare());
        assertEquals(4.0 * Math.sqrt(2), square.getDiagonalLength());
    }

    @Test
    public void testDiagonalZeroDimensions() {
        Rectangle zeroRect = new Rectangle(0.0, 0.0);
        assertEquals(0.0, zeroRect.getDiagonalLength());
    }
}
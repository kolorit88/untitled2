package geometry2d;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void area() {
        assertEquals(5 * 5, new Rectangle(5, 5).area());
    }

    @Test
    void testToString() {
        assertEquals("Rectangle: 5.0;5.0", new Rectangle(5, 5).toString());
    }
}
package geometry2d;

import Exceptions.IncorrectRadius;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    @Test
    void area() {
        assertEquals(5 * 5 * 3.14, new Circle(5).area());
        assertThrows(IncorrectRadius.class, ()->new Circle(0).area());
    }

    @Test
    void testToString() {
        assertEquals("Circle: 5.0", new Circle(5).toString());
        assertThrows(IncorrectRadius.class, ()->new Circle(0).area());
    }
}
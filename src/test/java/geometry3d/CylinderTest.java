package geometry3d;

import Exceptions.IncorrectRadius;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CylinderTest {

    @Test
    void volume() {
        assertEquals(4 * 4 * 3.14 *5, new Cylinder(4, 5).Volume());
        assertThrows(IncorrectRadius.class, () -> new Cylinder(0, 0).Volume());
    }
}
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TableTest {

    @Test
    void getValue() {
        Table table_test = new Table(5, 8);
        table_test.setValue(5, 8, 999);
        assertEquals(999, table_test.getValue(5,8));
    }

    @Test
    void testToString() {
        assertEquals("0;0;0\n0;0;0\n0;0;0", new Table(3, 3).toString());
    }

    @Test
    void average() {
        Table table_test = new Table(2, 3);
        for (int i = 1; i < 7; i++) {
            table_test.table_arr[i - 1] = i;
        }
        assertEquals((double) (1 + 2 + 3 + 4 + 5 + 6) / 6, table_test.average());

    }
}
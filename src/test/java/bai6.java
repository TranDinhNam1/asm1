import org.example.UnitTestCases.UnitTestCases;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class bai6 {
    UnitTestCases unitTestCases = new UnitTestCases();

    @Test
    public void test1() {
        assertEquals(1, unitTestCases.bai6(new int[]{3, 1, 4, 2}));
    }

    @Test
    public void test2() {
        assertEquals(-10, unitTestCases.bai6(new int[]{-10, 0, 5, 20}));
    }

    @Test
    public void test3() {
        assertThrows(IllegalArgumentException.class, () -> unitTestCases.bai6(new int[]{}));
    }
}

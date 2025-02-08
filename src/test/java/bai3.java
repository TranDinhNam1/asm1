import org.example.UnitTestCases.UnitTestCases;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class bai3 {
    UnitTestCases unitTestCases = new UnitTestCases();
    @Test
    public void test1() {
        assertEquals(3.0, unitTestCases.bai3(Arrays.asList(1, 2, 3, 4, 5)), 0.01);
    }

    @Test
    public void test2() {
        assertEquals(10.0, unitTestCases.bai3(Arrays.asList(10, 10, 10, 10)), 0.01);
    }

    @Test
    public void test3() {
        assertThrows(ArithmeticException.class, () -> unitTestCases.bai3(Collections.emptyList()));
    }
}

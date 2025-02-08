import org.example.UnitTestCases.UnitTestCases;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class bai4 {
    UnitTestCases unitTestCases = new UnitTestCases();
    @Test
    public void test1() {
        List<Integer> list = Arrays.asList(10, 20, 30);
        assertEquals(20, unitTestCases.bai4(list, 1));
    }

    @Test
    public void test2() {
        List<Integer> list = Arrays.asList(10, 20, 30);
        assertEquals(30, unitTestCases.bai4(list, 2));
    }

    @Test
    public void test3() {
        List<Integer> list = Arrays.asList(10, 20, 30);
        assertThrows(IndexOutOfBoundsException.class, () -> unitTestCases.bai4(list, 5));
    }
}

import org.example.UnitTestCases.UnitTestCases;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;


public class Thuong {
    UnitTestCases unitTestCases = new UnitTestCases();
    @Test
    public void test1() {
        assertEquals(2, unitTestCases.thuong(6,3));
    }

    @Test
    public void test2() {
        assertEquals(-5, unitTestCases.thuong(-10, 2));
    }

    @Test
    public void test3() {
        assertEquals(0, unitTestCases.thuong(0, 10));
    }

    @Test
    public void test4() {
        assertEquals(1, unitTestCases.thuong(10, 10));
    }

    @Test
    public void test5() {
        assertEquals(-1, unitTestCases.thuong(-10, 10));
    }

    @Test
    public void test6() {
        assertEquals(0, unitTestCases.thuong(-1, 10));
    }


    @Test
    public void test7() {
        assertEquals(0, unitTestCases.thuong(2, 5));
    }


    @Test
    public void test8() {
        assertEquals(2, unitTestCases.thuong(5, 2));
    }


    @Test
    public void test9() {
        assertEquals(1, unitTestCases.thuong(-5, -3));
    }


    @Test
    public void test10() {
        assertThrows(ArithmeticException.class, () -> unitTestCases.thuong(10, 0));
    }

}

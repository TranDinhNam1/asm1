import org.example.UnitTestCases.UnitTestCases;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tich {
    UnitTestCases unitTestCases = new UnitTestCases();

    @Test
    public void test1() {
        assertEquals(6, unitTestCases.tich(2, 3));
    }
    @Test
    public void test2() {
        assertEquals(-15, unitTestCases.tich(-5, 3));
    }

        @Test
        public void test3 () {
            assertEquals(0, unitTestCases.tich(0, 10));
        }

        @Test
        public void test4 () {
            assertEquals(100, unitTestCases.tich(10, 10));
        }

        @Test
        public void test5 () {
            assertEquals(-100, unitTestCases.tich(-10, 10));
        }

        @Test
        public void test6 () {
            assertEquals(0, unitTestCases.tich(0, -10));
        }

        @Test
        public void test7 () {
            assertEquals(1, unitTestCases.tich(1, 1));
        }

        @Test
        public void test8 () {
            assertEquals(-1, unitTestCases.tich(-1, 1));
        }

        @Test
        public void test9 () {
            assertEquals(49, unitTestCases.tich(7, 7));
        }

        @Test
        public void test10 () {
            assertEquals(-49, unitTestCases.tich(-7, 7));
        }
    }


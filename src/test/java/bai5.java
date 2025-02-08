import org.example.UnitTestCases.UnitTestCases;
import org.example.User.User;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class bai5 {
    UnitTestCases unitTestCases = new UnitTestCases();
    @Test
    public void test1() {
        User user = new User("John Doe");
        assertEquals("John Doe", unitTestCases.bai5(user));
    }

    @Test
    public void test2() {
        assertThrows(NullPointerException.class, () -> unitTestCases.bai5(null));
    }
}

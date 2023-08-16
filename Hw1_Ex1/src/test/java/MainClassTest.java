import org.example.MainClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainClassTest {
    @Test
    public void testGetLocalNumber() {
        MainClass number = new MainClass();

        int expected = 14;
        int actual = number.getLocalNumber();

        if (actual == expected) {
            System.out.println("Congratulations!! Actual number is eqaul expected number!");
        } else {
            System.out.println("Sorry! Actual number is not eqaul expected number");
        }

        assertEquals(expected, actual);

    }
}


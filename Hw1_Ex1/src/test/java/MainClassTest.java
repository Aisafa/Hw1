import org.example.MainClass;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainClassTest {
    @Test
    public void testGetLocalNumber() {
        MainClass number = new MainClass();

        int expected = 14;
        int actual = number.getLocalNumber();

        assert expected == actual : "\nSorry! " + actual + " is not eqaul " + expected;
    }

    @Test
    public void testGetClassNumber() {
        MainClass number2 = new MainClass();

        int actual = number2.getClassNumber();

        assert actual > 45 : "\nSorry! " + actual + " no more than " + 45;
    }

}


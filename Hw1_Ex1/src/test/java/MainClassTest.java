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

    @Test
    public void testGetClassString() {
        MainClass text = new MainClass();

        String actual = text.getClassString();

        assert actual.contains("Hello") : "\n " + actual + " is not contains Hello";
        assert actual.contains("hello") : "\n '" + actual + "' is not contains 'hello'";
    }

}


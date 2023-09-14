package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseIntegerTest {
    @Test
    public void testThatReverseWorks() {
        ReverseInteger reverseInteger = new ReverseInteger();
        int actual = reverseInteger.reverse(32445);
        assertEquals(54423, actual);
    }
}
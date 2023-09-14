package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EvenOddNegativeTest {
@Test
public void testThatEvenOddNegativeWorks(){
    EvenOddNegative evenOddNegative = new EvenOddNegative();
    boolean actual = evenOddNegative.evenOddOrNegative(4);
    assertEquals(true, actual);
}
}
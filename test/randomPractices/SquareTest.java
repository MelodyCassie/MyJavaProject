package randomPractices;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    public void testSquare(){
        Square input = new Square();
        int actual = input.squareRoot(4);
        assertEquals(16, actual);

    }

}
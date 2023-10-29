package MyRandomPractices;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FunctionThatReturnsMaxOfAnArrayTest {
    @Test
    public void checkForMaxArray(){
        int[] arrayOfNumbers = {5,4,6,7,9,4,6};

        int max = FunctionThatReturnsMaxOfAnArray.checksForMaxArray(arrayOfNumbers);

        assertEquals(9,max);

    }

}
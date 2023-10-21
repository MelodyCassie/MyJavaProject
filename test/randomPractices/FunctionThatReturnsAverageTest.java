package randomPractices;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FunctionThatReturnsAverageTest {
    @Test
    public void getTheAverage(){
        int[] arrayOfNumbers = {5,6,7,8,9,5};
        double average = FunctionThatReturnsAverage.checkForAverage(arrayOfNumbers);
        assertEquals(6.666666666666667,average);


    }

}
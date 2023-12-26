package MyArrayPractice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AverageOfArrayTest {
    @Test
    public void averageTest(){
        int[] numbers = {15, 22, 30, 12, 45, 7};
        double result = AverageOfArray.getAverage(numbers);
        assertEquals(21.833333333333333333333333333333,  result);
    }

}
package MyArrayPractice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsEvenArraySumTest{
    @Test
    public void isEvenSumTest(){
        int[] numbers = {7, 12, 5, 8, 11, 14, 6, 9};
        int sum = IsEvenArraySum.sumEven(numbers);
        assertEquals(40, sum);
    }

}
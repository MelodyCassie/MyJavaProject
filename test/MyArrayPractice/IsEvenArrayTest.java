package MyArrayPractice;

import org.junit.jupiter.api.Test;
import tdd.Account;

import static org.junit.jupiter.api.Assertions.*;

class IsEvenArrayTest extends Account {
    @Test
    public void isEvenTest(){
        int[] numbers = {7, 12, 5, 8, 11, 14, 6, 9};
        int[] expected = {12,8,14,6};
        int[] evenNumbers = IsEvenArray.even(numbers);
        assertArrayEquals(expected, evenNumbers);
    }

}
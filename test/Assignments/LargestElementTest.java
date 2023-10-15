package Assignments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LargestElementTest {
    @Test
    public void findLargestElement(){
        int[] numbers = {5, 2, 9, 88, 7, 4};
        int result = LargestElement.findLargestElement(numbers);
        assertEquals(88, result);
    }
}
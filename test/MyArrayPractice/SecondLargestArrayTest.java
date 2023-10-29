package MyArrayPractice;

import org.junit.jupiter.api.Test;
import tdd.Account;

import static org.junit.jupiter.api.Assertions.*;

class SecondLargestArrayTest extends Account {
    @Test
    public void secondLargestTest(){
        int[] numbers = {15, 22, 30, 12, 45, 7};
        int secondLargest = SecondLargestArray.findSecondLargest(numbers);
        assertEquals(30,secondLargest);
    }

}
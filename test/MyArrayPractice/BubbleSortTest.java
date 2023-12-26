package MyArrayPractice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {
    @Test
    public void bubbleSortTest(){
        int[] numbers = {64, 34, 25, 12, 22, 11, 90};
        int[] sorted = BubbleSort.bubbleSort(numbers);
        int[] expected = {};
        assertArrayEquals(sorted, expected);



    }

}
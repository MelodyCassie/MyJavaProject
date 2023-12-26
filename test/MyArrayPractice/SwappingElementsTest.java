package MyArrayPractice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SwappingElementsTest  {
    @Test
    public void elementSwapping(){
        int[] numbers = {10, 20, 30, 40, 50, 60, 70};
        int[] swapped = SwappingElements.swap(numbers);
        int[] expected = {70,20,30,40,50,60,10};
        assertArrayEquals(swapped,expected);
    }

}
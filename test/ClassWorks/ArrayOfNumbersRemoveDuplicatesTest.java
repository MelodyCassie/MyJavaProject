package ClassWorks;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ArrayOfNumbersRemoveDuplicatesTest {
    @Test
    public void testRemoveDuplicate() {
        //given
        int[] numbers = {4, 9, 4, 4, 7, 9, 1, 7};
        ArrayOfNumbersRemoveDuplicates arrayOfNumbersRemoveDuplicates = new ArrayOfNumbersRemoveDuplicates();
        //new array  object of class ArrayOfNumbersRemoveDuplicate  method name
        int[] uniqueValuesArray = arrayOfNumbersRemoveDuplicates.remove(numbers);
        //whatever  unique values we get assert
        assertEquals(4,uniqueValuesArray[0]);
        assertEquals(9,uniqueValuesArray[1]);
        assertEquals(4,uniqueValuesArray.length);

    }
}
package MyArrayPractice;

import org.junit.jupiter.api.Test;
import tdd.Account;

import static org.junit.jupiter.api.Assertions.*;

class RotateAnArrayTest extends Account {
    @Test
    public void rotateAnArrayTest(){
        int[] numbers = {1, 2, 3, 4, 5};
        int[] rotated = RotateAnArray.rotate(numbers);
        int[] expected = {5, 4, 1, 2, 3};
        assertArrayEquals(rotated,expected);

    }

}
package MyArrayPractice;

import org.junit.jupiter.api.Test;
import tdd.Account;

import static org.junit.jupiter.api.Assertions.*;

class CommonElementInArraysTest extends Account {
    @Test
    public void commonElementTest(){
        int[] array1 = {10, 20, 30, 40, 50};
        int[] array2 = {30, 40, 50, 60, 70};
        int[] commonElements = CommonElementInArrays.findCommonElements(array1,array2);
        int[] expected = {30, 40, 50};
        assertArrayEquals(expected, commonElements);


    }

}
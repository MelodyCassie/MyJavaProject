package MyArrayPractice;

import org.junit.jupiter.api.Test;
import tdd.Account;

import static org.junit.jupiter.api.Assertions.*;

class MaximumElementTest extends Account {
    @Test
    public void MaximumTest(){
        int [] numbers = {8, 23, 45, 12, 67, 5, 34, 19};
        int result = MaximumElement.maximumCheck(numbers);
        assertEquals(67,result);
    }

}
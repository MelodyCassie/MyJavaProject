package MyArrayPractice;

import org.junit.jupiter.api.Test;
import tdd.Account;

import static org.junit.jupiter.api.Assertions.*;

class ElementsOccurrenceTest extends Account {
    @Test
    public void elementsOccurrenceTest(){
        int[] numbers = {5, 2, 7, 8, 5, 3, 7, 2, 7, 5, 8, 8, 1};
        int[] occurrence = ElementsOccurrence.checkOccurrence(numbers);
        int[] expected = {5, 1, 2, 1, 7, 1, 8, 1, 5, 1, 3, 1, 7, 1, 2, 1, 7, 1, 5, 1, 8, 1, 8, 1, 1, 1};
        assertArrayEquals(occurrence,expected);
    }
}

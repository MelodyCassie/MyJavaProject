package Taskss;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FunctionOfStringsThatReturnIntTest {
    @Test
    public void countNumbersInStringArray() {
        String[] arrayOfStrings = {"melly245", "melody888", "melody848"};
        int total = FunctionOfStringsThatReturnInt.countStringNumbers(arrayOfStrings);
        assertEquals(9, total);

    }
}

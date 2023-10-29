package Assignments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FunctionThatCollectsADecimalAndReturnsTheBinaryTest {
    @Test
    public void returnBinaryOfADecimal(){
        int result = FunctionThatCollectsADecimalAndReturnsTheBinary.changeToABinary(4);
        assertEquals(100,result);

    }
}
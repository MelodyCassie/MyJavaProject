package Assignments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FunctionThatCollectsABinaryAndReturnsADecimalTest {
    @Test
    public void changeToDecimal(){
        int result = FunctionThatCollectsABinaryAndReturnsADecimal.changeToDecimal(100);
        assertEquals(4,result);


    }

}
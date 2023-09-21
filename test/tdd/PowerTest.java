package tdd;

import randomPractices.Power;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PowerTest {
    @Test
    public void testRaisedToPower(){
        Power power = new Power();
        int result = power.raiseToPower(4,2);
        assertEquals(32,result);


    }

}
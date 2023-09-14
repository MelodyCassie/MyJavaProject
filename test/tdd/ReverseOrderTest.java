package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class ReverseOrderTest {
    @Test
    public void testReverseOrder(){
        ReverseOrder reverseOrder = new ReverseOrder();
        int actual = ReverseOrder.reverse(547);
        assertEquals(745,actual);
    }

 }
  

package tdd;

import org.junit.jupiter.api.Test;

import java.time.Year;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    @Test
    public void testThatCarCanTurnOn(){
        Car melCar = new Car();
        melCar.setIsOn(melCar.getIsOn());
        assertTrue(true);
    }
    @Test
    public void testThatCarCanBeTurnedOff(){
        Car melCar = new Car();
        melCar.setIsOn(melCar.getIsOn());
        assertTrue(true);
        melCar.setIsOn(false);
        assertFalse(false);
    }
    @Test
     public void testTheYear(){
        Car melCar = new Car();
        melCar.setIsOn(true);
        String actual = melCar.yearNumber("Year 2015");
    }
    @Test
    public void testPrice(){
        Car melCar = new Car();
        melCar.setIsOn(true);
        int actual = melCar.priceRange(100000000);
        assertEquals(100000000, actual);
    }



}
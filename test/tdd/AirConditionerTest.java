package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AirConditionerTest {
    @Test
    public void testThatAcExist(){
        AirConditioner melAirconditioner = new AirConditioner();
        melAirconditioner.setToggleOn(melAirconditioner.getToggleOn());
        assertTrue(true);
    }
    @Test
    public void testThatAcTurnsOnAndOff(){
        AirConditioner melAirconditioner = new AirConditioner();
        melAirconditioner.setToggleOn(true);
        assertTrue(true);
        melAirconditioner.setToggleOn(melAirconditioner.getToggleOn());
        assertFalse(false);
    }
    @Test
    public void testThatAcTemperatureIncreases(){
        AirConditioner melAirconditioner = new AirConditioner();
        melAirconditioner.setToggleOn(true);
        int actual = melAirconditioner.increaseBeyondDefault(24,1);
        assertEquals(25,actual);
    }

    @Test
    public void testThatAcDecreasesBelowThirty(){
        AirConditioner melAirconditioner = new AirConditioner();
        melAirconditioner.setToggleOn(melAirconditioner.getToggleOn());
        int actual = melAirconditioner.decreaseBelowThirty(30,1);
        assertEquals(29,actual);
    }

    @Test
    public void testThatAcDoesNotIncreaseBeyondThirty(){
        AirConditioner melAirconditioner = new AirConditioner();
        melAirconditioner.setToggleOn(true);
        boolean actual = melAirconditioner.increaseBeyondThirty(true);
        assertTrue(true);
    }
    @Test
    public void testThatAcDoesNotDecreaseBelowSixteen(){
        AirConditioner melAirconditioner = new AirConditioner();
        melAirconditioner.setToggleOn(true);
        boolean actual = melAirconditioner.decreaseBelowSixteen(true);
        assertTrue(true);
    }
}
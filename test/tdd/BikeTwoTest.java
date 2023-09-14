package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BikeTwoTest {


    @Test
    public void testThatBikeExist(){
        BikeTwo melBike = new BikeTwo();
        assertNotNull(melBike);
    }

    @Test
    public void testThatOurBikeIsOffAndCanTurnOn(){
        BikeTwo melBike = new BikeTwo();
//        assertFalse(melBike.isToggleOn());
        melBike.getIsToggleOn();
        assertTrue(melBike.getIsToggleOn());
        melBike.getIsToggleOn();

    }
   // @Test
   //public void testThatOurBikeCanTurnOff(){
     //   BikeTwo okada = new BikeTwo();
     //   okada.toggleOn();
       // assertTrue(okada.isOn());

       // okada.toggleOn();
      //  assertFalse(okada.isOn());

    }
//
//
//    @Test
//    public void testThatBikeIsOffAndCanTurnOn(){
//        BikeTwo melBike = new BikeTwo();
//        melBike.setIsOn(melBike.isOn());
//        assertFalse(false);
//        melBike.setIsOn((melBike.isOn()));
//        assertTrue(true);
//
//    }
//    @Test
//    public void testThatBikeTurnsOn(){
//        BikeTwo melBike = new BikeTwo();
//        melBike.setIsOn(melBike.isOn());
//        assertTrue(true);
//    }
//    @Test
//    public void testThatBikeWillTurnOffAndOn(){
//        BikeTwo melBike = new BikeTwo();
//        melBike.setIsOn(melBike.isOn());
//        assertTrue(true);
//        melBike.setIsOn(melBike.isOn());
//        assertFalse(false);
//    }
//    @Test
//    public void testThatSpeedIncreasesPlusOne(){
//        BikeTwo melBike = new BikeTwo();
//        melBike.setIsOn(melBike.isOn());
//        int actual = melBike.gearOne(15, 1);
//        assertEquals(16, actual);
//    }
//    @Test
//    public void testThatSpeedIncreasesPlusTwo(){
//        BikeTwo melBike = new BikeTwo();
//        melBike.setIsOn(melBike.isOn());
//        int actual = melBike.gearTwo(24,2);
//        assertEquals(26,actual);
//    }
//    @Test
//     public void testThatSpeedIncreasesPlusThree(){
//        BikeTwo melBike = new BikeTwo();
//        melBike.setIsOn(melBike.isOn());
//       int actual = melBike.plusThree(35, 3);
//       assertEquals(38,actual);
//    }
//     @Test
//     public void testThatSpeedIncreasesPlusFour() {
//        BikeTwo melBike = new BikeTwo();
//        melBike.setIsOn(melBike.isOn());
//        int actual = melBike.plusFour(44,4);
//        assertEquals(48,actual);
//    }
//
//
//
//
//     @Test
//    public void testThatSpeedDecreasesMinusOne(){
//        BikeTwo melBike = new BikeTwo();
//        melBike.setIsOn(melBike.isOn());
//        int actual = melBike.minusOne(15,1);
//        assertEquals(14,actual);
//     }
//
//     @Test
//    public void testSpeedDecreasesMinusTwo(){
//        BikeTwo melBike = new BikeTwo();
//        melBike.setIsOn(melBike.isOn());
//        int actual = melBike.minusTwo(24,2);
//        assertEquals(22,actual);
//    }
//
//    @Test
//    public void testThatSpeedDecreasesMinusThree(){
//        BikeTwo melBike = new BikeTwo();
//        melBike.setIsOn(melBike.isOn());
//        int actual = melBike.minusThree(35,3);
//        assertEquals(32, actual);
//     }
//
//     @Test
//    public void testThatSpeedDecreasesMinusFour(){
//        BikeTwo melBike = new BikeTwo();
//        melBike.setIsOn(melBike.isOn());
//        int actual = melBike.minusFour(44,4);
//        assertEquals(40,actual);
//     }
//
//     @Test
//    public void testThatSpeedIncreasesPlusSix(){
//        BikeTwo melBike = new BikeTwo();
//        melBike.setIsOn(melBike.isOn());
//        int actual = melBike.plusSix(15,6);
//        assertEquals(21,actual);
//     }
//
//     @Test
//    public void testThatSpeedIncreasesPlusThreePlus(){
//        BikeTwo melBike = new BikeTwo();
//        melBike.setIsOn(melBike.isOn());
//        int actual = melBike.plusThreePlus(28,3);
//        assertEquals(31,actual);
//     }
//
//
//     @Test
//    public void testThatSpeedIncreasesPlusFourPlus(){
//        BikeTwo melBike = new BikeTwo();
//        melBike.setIsOn(melBike.isOn());
//        int actual = melBike.plusFour(37, 4);
//        assertEquals(41,actual);
//     }

//}
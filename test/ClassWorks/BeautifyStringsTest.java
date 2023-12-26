package ClassWorks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BeautifyStringsTest  {
    @Test
    public void testThatFullStopCanBeAdded(){
        String result = BeautifyStrings.addFullStop("ziri");
        assertEquals("ziri.",result);
    }

    @Test
    public void testFullStopCanBeAddedToAnotherString(){
        String result = BeautifyStrings.addFullStop("melody.");
        assertEquals("melody.", result);
    }

    @Test
    public void testCapitalizeFirstLetter(){
        String result = BeautifyStrings.capitalizeFirstLetter("ziri");
        assertEquals("Ziri",result);

    }
    @Test
    public void testBeautifiedStrings(){
        String result = BeautifyStrings.stringsAreBeautified("i am a copper");
        assertEquals("I am a copper", result);
    }

}